package org.example.vikas.pratice.folder1;

public class MobileApp {

    public String name;
    public String category;
    public int ratings;
    public String comments;

    public MobileApp(String name,
                     String category,
                     int ratings,
                     String comments) {
        this.name = name;
        this.category = category;
        this.ratings = ratings;
        this.comments = comments == null ? "" : comments;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MobileApp) {
            MobileApp comparingObj = (MobileApp) obj;
            return (comparingObj.name.equals(this.name) &&
                    comparingObj.category.equals(this.category) &&
                    comparingObj.ratings == this.ratings &&
                    comparingObj.comments.equals(this.comments));
        }
        return false;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("name: ").append(name)
                .append(", category: ").append(category)
                .append(", rating: ").append(ratings)
                .toString();
    }
}