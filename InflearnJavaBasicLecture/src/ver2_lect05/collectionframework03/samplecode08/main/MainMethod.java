package ver2_lect05.collectionframework03.samplecode08.main;

import ver2_lect05.collectionframework03.samplecode08.service.impl.CallDataServiceImpl;

public class MainMethod {

    public static CallDataServiceImpl callDataService = new CallDataServiceImpl();

    public static void main(String[] args) {

        String industryData = callDataService.getIndustryData(1);
        System.out.println("industryData : " + industryData);

        Object getNationName = callDataService.getNationData("국가1");
        System.out.println("getNationName : " + getNationName);

    }

}