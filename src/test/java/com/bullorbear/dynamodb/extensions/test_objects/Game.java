package com.bullorbear.dynamodb.extensions.test_objects;

import java.util.Date;

import com.bullorbear.dynamodb.extensions.datastore.DatastoreObject;
import com.bullorbear.dynamodb.extensions.mapper.annotations.HashKey;
import com.bullorbear.dynamodb.extensions.mapper.annotations.Table;

@Table("game")
public class Game extends DatastoreObject {

  private static final long serialVersionUID = -6578894965876600554L;

  @HashKey
  private String name;

  private String genre;

  private Date yearReleased;

  public Game() {
  }

  public Game(String name, String genre, Date yearReleased) {
    super();
    this.name = name;
    this.genre = genre;
    this.yearReleased = yearReleased;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Date getYearReleased() {
    return yearReleased;
  }

  public void setYearReleased(Date yearReleased) {
    this.yearReleased = yearReleased;
  }

  @Override
  public String toString() {
    return "Game [name=" + name + ", genre=" + genre + ", yearReleased=" + yearReleased + "]";
  }

}
