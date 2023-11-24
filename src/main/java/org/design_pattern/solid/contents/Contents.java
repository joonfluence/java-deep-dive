package org.design_pattern.solid.contents;

import java.time.LocalDate;

public abstract class Contents implements Viewable {
    private String name;
    private LocalDate releaseDate;
    private String DirectorName;
    private double rate;
    private String viewUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirectorName() {
        return DirectorName;
    }

    public void setDirectorName(String directorName) {
        DirectorName = directorName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }
}
