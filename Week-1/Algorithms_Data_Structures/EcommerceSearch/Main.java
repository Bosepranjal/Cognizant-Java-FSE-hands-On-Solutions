package EcommerceSearch;

public class Main {
    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
            new Product(105, "Mouse", "Electronics"),
            new Product(101, "Notebook", "Stationery"),
            new Product(104, "Shoes", "Fashion"),
            new Product(102, "Mobile", "Electronics")
        };

        // Linear Search without sorting
        System.out.println("Linear Search:");
        Product linearResult = SearchService.linearSearch(products, 104);
        System.out.println(linearResult != null ? linearResult : "Product not found.");

        // Sort products for Binary Search
        SearchService.sortProductsById(products);

        // Binary Search on sorted data
        System.out.println("Binary Search:");
        Product binaryResult = SearchService.binarySearch(products, 102);
        System.out.println(binaryResult != null ? binaryResult : "Product not found.");
    }
}

 /*Output of the code : Linear Search:
                        ProductID: 104, Name: Shoes, Category: Fashion
                        Binary Search:
                        ProductID: 102, Name: Mobile, Category: Electronics */