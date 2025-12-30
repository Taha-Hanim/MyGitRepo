package pl.edu.vistula.firstrestapispring.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format("product with %d was not found ", id));
    }
}
