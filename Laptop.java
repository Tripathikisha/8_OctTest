    package Test.example.Test.Model;

    import jakarta.persistence.Entity;
    import jakarta.persistence.Id;
    import jakarta.persistence.OneToOne;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Data
    public class Laptop {
        @Id
        private String ID;
        private String name;
        private String brand;
        private Integer price;

        @OneToOne
        private Student student;
    }
