package builder;

public class Product {
    private String nom;

    private String description;

    private double prix;

    private int quantite;

    private Product() {}

    private Product(String nom, String description, double prix, int quantite) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public static class ProductBuilder {

        private String nom;

        private String description;

        private double prix;

        private int quantite;

        private static ProductBuilder instance;

        private ProductBuilder() {}

        public static ProductBuilder getBuilder() {
            instance = new ProductBuilder();
            return instance;
        }

        public Product build() {
            return new Product(nom, description, prix, quantite);
        }

        public ProductBuilder withNom(String nom) {
            this.nom = nom;
            return this;
        }

        public ProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder withPrix(double prix) {
            this.prix = prix;
            return this;
        }

        public ProductBuilder withQuantite(int quantite) {
            this.quantite = quantite;
            return this;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Product [nom=" + nom + ", description=" + description + ", prix=" + prix
                + ", quantite=" + quantite + "]";
    }
}
