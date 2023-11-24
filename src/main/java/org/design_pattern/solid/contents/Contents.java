package org.design_pattern.solid.contents;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public abstract class Contents implements Viewable {
    private String name;
    private LocalDate releaseDate;
    private String DirectorName;
    private double rate;
    private String viewUrl;
}
