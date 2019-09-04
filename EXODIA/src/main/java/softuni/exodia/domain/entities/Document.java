package softuni.exodia.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "documents")
public class Document extends BaseEntity {

    private String title;
    private String content;

    public Document(){

    }

    @Column(name = "title", nullable = false)
    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "content", columnDefinition = "TEXT", nullable = false)
    @NotNull
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
