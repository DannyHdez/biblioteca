package daniel.proyectos.biblioteca.dto;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class BookDTO {
    private int id;
    private String isbn;
    private String titleEs;
    private String titleEn;
    private String titleCa;
    private Date publicationDate;
    private EditorialInfoDTO editorial;
    private List<AuthorInfoDTO> authors;
    private List<GenreInfoDTO> genres;
}
