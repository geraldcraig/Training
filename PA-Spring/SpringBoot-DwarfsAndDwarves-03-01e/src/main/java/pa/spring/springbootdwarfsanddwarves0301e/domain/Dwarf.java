package pa.spring.springbootdwarfsanddwarves0301e.domain;

import javax.persistence.*;

@Entity
@Table(name = "dwarfs")
public class Dwarf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String author;
    private String image;

    public Dwarf() {
    }

    public Dwarf(String name, String author, String image) {
        this.name = name;
        this.author = author;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
