package practice.demo.Model;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@NoArgsConstructor
@Entity
public class CommonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private String title;

    @NotNull
    @Column(length=1000)
    private String content;

    @Column
    private String author;

    @Builder
    public CommonModel(String title,String content,String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }
}
