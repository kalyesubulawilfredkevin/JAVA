class Products {
    private int id;
    private String name;
    private String description;
    private String category;
    private int unitprice;
    private int costprice;
    private int quantityinstock;

    Products(int id, String name, String description, String category, int unitprice,
            int costprice, int quantityinstock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.unitprice = unitprice;
        this.costprice = costprice;
        this.quantityinstock = quantityinstock;

    }

    void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Unitprice: " + unitprice);
        System.out.println("Costprice: " + costprice);

        // stock status
        if (quantityinstock == 0) {
            System.out.println("Status: Out of stock");
        } else if (quantityinstock < 5) {
            System.out.println("status: Low stock");
        } else {
            System.out.println("Status: In stock");
        }
        System.out.println("Quantityinstock: " + quantityinstock);

        /// profit check
        if (unitprice > costprice) {
            System.out.println("Products is profitable");
        } else {
            System.out.println("No profit on this product");
        }
    }

    boolean isInStock() {
        return quantityinstock > 0;
    }

}

class Employee {
    private int emp_id;
    private String name;
    private String role;
    @SuppressWarnings("unused")
    private String password;
    @SuppressWarnings("unused")
    private String commissionrate;

    Employee(int emp_id, String name, String role) {
        this.emp_id = emp_id;
        this.name = name;
        this.role = role;

    }

    void displayInfo() {
        System.out.println("Id: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);

    }
}

class Customers {
    private int cust_id;
    private String name;
    private String telno;
    private String email;
    private String address;

    Customers(int cust_id, String name, String telno, String email, String address) {
        this.cust_id = cust_id;
        this.name = name;
        this.telno = telno;
        this.email = email;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("Cust_id: " + cust_id);
        System.out.println("Name: " + name);
        System.out.println("Telno: " + telno);
        System.out.println("Email: " + email);

        // condition operator
        String status = (email.contains("@") && email.contains(".")) ? "verified" : "Needs verification";
        System.out.println("Email Status: " + status);

        System.out.println("Address: " + address);

    }

}

class Transactions {
    private int trans_id;
    private int emp_id;
    private int cust_id;
    private String payment;
    private int totalamount;
    private String productbought;

    Transactions(int trans_id, int emp_id, int cust_id, String payment, int totalamount, String productbought) {
        this.trans_id = trans_id;
        this.emp_id = emp_id;
        this.cust_id = cust_id;
        this.payment = payment;
        this.totalamount = totalamount;
        this.productbought = productbought;
    }

    void displayInfo() {
        System.out.println("Trans_id: " + trans_id);
        System.out.println("Emp_id: " + emp_id);
        System.out.println("Cust_id: " + cust_id);
        System.out.println("Payment: " + payment);
        System.out.println("Totalamount: " + totalamount);
        // totalamount validation
        if (totalamount <= 0) {
            System.out.println("ERROR: Invalid transaction amount!");
        } else if (totalamount > 100000) {
            System.out.println("High Value Transaction");
        }
        System.out.println("Productbought: " + productbought);
    }

}

public class Sales {
    public static void main(String[] args) {
        Products product1 = new Products(1, "Four Cousins", "Wine and Spirit", "Alcoholic", 35000, 29000, 20);
        // MAIN METHOD FOR PRODUCT
        if (product1.isInStock()) {
            System.out.println("\n product availabale for sale!");
        } else {
            System.out.println("\n product out of stock!");
        }

        System.out.println("====all products=====");
        product1.displayInfo();
        System.out.println();

        Transactions trans1 = new Transactions(1, 020, 004, null, 0, null);
        System.out.println("====transactions====");
        trans1.displayInfo();
        System.out.println();

        Customers customer1 = new Customers(004, "john", "0761492594", "john@gmail.com", "gulu");
        System.out.println("===customers===");
        customer1.displayInfo();
        System.out.println();

        Employee employee1 = new Employee(020, "mark", "cashier");
        System.out.println("===employee===");
        employee1.displayInfo();
    }
}
