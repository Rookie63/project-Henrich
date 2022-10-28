package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE employee (
  id INT NOT NULL AUTO_INCREMENT,    
  name VARCHAR(30) NOT NULL,   
  age INT NOT NULL,    
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "mangaLibrary")
public class Manga {

   @Id  // primary key
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id") // specify the column name. Without it, it will use method name
   private Integer id;

   @Column(name = "title")
   private String title;

   @Column(name = "author")
   private String author;
   
   @Column(name = "genre")
   private String genre;
   
   @Column(name = "volumes")
   private Integer volumes;
   
   @Column(name = "year")
   private Integer year;
   
   public Manga() {
   }

   public Manga(Integer id, String title, String author, String genre, Integer volumes, Integer year) {
      this.id = id;
      this.title = title;
      this.author = author;
      this.genre = genre;
      this.volumes = volumes;
      this.year = year;
   }

   public Manga(String title, String author, String genre, Integer volumes, Integer year) {
	   this.title = title;
	   this.author = author;
	   this.genre = genre;
	   this.volumes = volumes;
	   this.year = year;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }
   
   public String getAuthor() {
	   return author;
   }

   public void setAuthor(String author) {
	   this.author = author;
   }
   public String getGenre() {
	   return genre;
   }

   public void setGenre(String genre) {
	      this.genre = genre;
   }
   
   public Integer getVolumes() {
      return volumes;
   }

   public void setVolumes(Integer volumes) {
      this.volumes = volumes;
   }
   
   public Integer getYear() {
      return year;
   }

   public void setYear(Integer year) {
      this.year = year;
   }
   
   @Override
   public String toString() {
      return "Manga: " + this.id + ", " + this.title + ", " + this.author + ", " + this.genre + ", " + this.volumes + ", " + this.year;
   }
}