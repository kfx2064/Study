package org.hdcd.controller;

import org.apache.ibatis.ognl.IteratorEnumeration;
import org.hdcd.domain.Item;
import org.hdcd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    public String uploadPath;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(Model model) throws Exception {
        List<Item> itemList = itemService.list();

        model.addAttribute("itemList", itemList);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String registerForm(Model model) {
        model.addAttribute(new Item());

        return "item/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String register(Item item, RedirectAttributes rttr) throws Exception {
        MultipartFile pictureFile = item.getPicture();
        MultipartFile previewFile = item.getPreview();

        String createdPictureFilename = uploadFile(pictureFile.getOriginalFilename(), pictureFile.getBytes());
        String createdPreviewFilename = uploadFile(previewFile.getOriginalFilename(), previewFile.getBytes());

        item.setPictureUrl(createdPictureFilename);
        item.setPreviewUrl(createdPreviewFilename);

        itemService.register(item);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/item/list";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String modifyForm(Integer itemId, Model model) throws Exception {
        Item item = itemService.read(itemId);

        model.addAttribute(item);

        return "item/modify";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String modify(Item item, RedirectAttributes rttr) throws Exception {
        MultipartFile pictureFile = item.getPicture();

        if (pictureFile != null && pictureFile.getSize() > 0) {
            String createdFilename = uploadFile(pictureFile.getOriginalFilename(), pictureFile.getBytes());
            item.setPictureUrl(createdFilename);
        }

        MultipartFile previewFile = item.getPreview();

        if (previewFile != null && previewFile.getSize() > 0) {
            String createdFilename = uploadFile(previewFile.getOriginalFilename(), previewFile.getBytes());

            item.setPreviewUrl(createdFilename);
        }

        itemService.modify(item);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/item/list";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String removeForm(Integer itemId, Model model) throws Exception {
        Item item = itemService.read(itemId);

        model.addAttribute(item);

        return "item/remove";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String remove(Item item, RedirectAttributes rttr) throws Exception {
        itemService.remove(item.getItemId());

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/item/list";
    }

    private String uploadFile(String originalName, byte[] fileDate) throws Exception {
        UUID uid = UUID.randomUUID();
        String createFileName = uid.toString() + "_" + originalName;
        File target = new File(uploadPath, createFileName);
        FileCopyUtils.copy(fileDate, target);
        return createFileName;
    }

    // 이어서...

}
