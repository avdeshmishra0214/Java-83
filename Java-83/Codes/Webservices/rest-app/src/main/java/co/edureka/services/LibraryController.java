package co.edureka.services;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.bindings.Book;

@Path("/library")
public class LibraryController {
	@GET
	@Produces("application/json")
	@Path("/all")
	public List<Book> getAllBooks(){
		List<Book> books = Arrays.asList(
						new Book(1001L,"Java Complete Reference", "James Ghosling", 850.75f),
						new Book(1002L,"Java Made Easy", "Patrick Naughtan", 950.0f),
						new Book(1003L,"An Ultimate Guide for Java", "Kris Warth", 482f)
					);
		
		return books;
	}
}
