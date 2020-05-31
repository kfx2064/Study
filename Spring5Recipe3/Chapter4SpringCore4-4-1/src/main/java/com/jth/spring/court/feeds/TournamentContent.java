package com.jth.spring.court.feeds;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.feed.AbstractAtomFeedView;

import com.rometools.rome.feed.atom.Entry;
import com.rometools.rome.feed.atom.Feed;

public class TournamentContent {

	private static final AtomicInteger idCounter = new AtomicInteger();
	private final String author;
	private final Date publicationDate;
	private final String name;
	private final String link;
	private final int id;
	
	public TournamentContent(String author, Date publicationDate, String name, String link, int id) {
		this.author = author;
		this.publicationDate = publicationDate;
		this.name = name;
		this.link = link;
		this.id = id;
	}

	public static AtomicInteger getIdcounter() {
		return idCounter;
	}

	public String getAuthor() {
		return author;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public String getName() {
		return name;
	}

	public String getLink() {
		return link;
	}

	public int getId() {
		return id;
	}
	
	public static TournamentContent of(String author, Date date, String name, String link) {
		return new TournamentContent(author, date, name, link, idCounter.incrementAndGet());
	}
	
}
