    package Test.example.Test.Model;

    import jakarta.persistence.Entity;
    import jakarta.persistence.Id;
    import jakarta.persistence.ManyToOne;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Data
    public class Book {
        @Id
        private String ID;

        private String title;
        private String author;
        private String description;
        private String price;

        @ManyToOne
        private Student student;
    }
