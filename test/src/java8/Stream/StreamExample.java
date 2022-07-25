/*
 * package java8.Stream;
 * 
 * import java.util.ArrayList; import java.util.Collections; import
 * java.util.Comparator; import java.util.List; import java.util.Set; import
 * java.util.TreeSet; import java.util.function.Function; import
 * java.util.function.IntFunction; import java.util.stream.Collectors; import
 * java.util.stream.Stream;
 * 
 * class Product {
 * 
 * public Product(int a) { }
 * 
 * int id; String name; float price;
 * 
 * public Product(int id, String name, float price) { this.id = id; this.name =
 * name; this.price = price; } int getId() { return id; } public String
 * toString() { return this.id + " " + this.name; } }
 * 
 * public class StreamExample {
 * 
 * public static void main(String[] args) {
 * 
 * Integer[] arr = new Integer[] { 1, 2 }; List<Product> productsList = new
 * ArrayList<Product>(); // Adding Products productsList.add(new Product(5,
 * "Apple Laptop", 90000f)); productsList.add(new Product(4, "Sony Laptop",
 * 28000f)); productsList.add(new Product(2, "Dell Laptop", 30000f));
 * productsList.add(new Product(1, "HP Laptop", 25000f)); productsList.add(new
 * Product(3, "Lenevo Laptop", 28000f)); productsList.add(new Product(1,
 * "Acer Laptop", 25000f)); productsList.add(new Product(4, "Alien Laptop",
 * 28000f));
 * 
 * // System.out.println(productsList); // Collections.sort(productsList, (a, b)
 * -> (((Integer) // a.id).compareTo((Integer) b.id))); //
 * System.out.println(productsList);
 * 
 * var stream = productsList.stream(); Boolean result; List lst; // result //
 * var s = productsList.stream().allMatch(a -> {System.out.println(a.id); return
 * // a.id > 0;});
 * 
 * // result = productsList.stream().anyMatch(a -> a.id > 6);
 * 
 * // var aa = productsList.stream().toArray(e -> new Product[e]);
 * 
 * // Stream.iterate(productsList, p -> {System.out.println(p); return p;}); //
 * System.out.println(aa[4]);
 * 
 * 
 * lst = productsList.stream().filter(c -> c.id ==
 * 1).collect(Collectors.toList());
 * 
 * var s = productsList.stream().map(c -> c.id).collect(Collectors.toList());
 * 
 * 
 * Float totalPrice = productsList.stream().map(product ->
 * product.price).reduce(0f, (sum, price) -> { System.out.println(sum + " " +
 * price); return sum + price; });
 * 
 * String n = productsList.stream().map(product -> product.name).reduce("", (a,
 * b) -> { return a + b; });
 * 
 * 
 * 
 * var productSet = productsList.stream().collect(Collectors.groupingBy(c ->
 * c.id)).entrySet().stream().collect(Collectors .toMap(a -> a.getKey(),a
 * ->a.getValue().stream().limit(1).toList(),(a, b) -> b));
 * 
 * var a = productsList.stream().collect(Collectors.groupingBy(
 * Function.identity(), Collectors.counting()));
 * 
 * a.entrySet().forEach(c ->
 * System.out.println("key : "+c.getKey()+", value : "+c.getValue()));
 * 
 * //System.out.println(a.entrySet());
 * 
 * var uniqueStudentSet = productsList .stream()
 * .collect(Collectors.toCollection(()-> new
 * TreeSet<>(Comparator.comparing(Product::getId))) );
 * 
 * 
 * // System.out.println(productSet); // .collect(Collectors.toMap(a -> a,a ->
 * a,null)); // var elementsBySite = productsList.stream() //
 * .collect(Collectors.groupingBy(c-> c.id, Collectors.mapping(e -> e,
 * Collectors.toList())));
 * 
 * // productSet.forEach(c -> System.out.println(c)); //
 * System.out.println(productSet);
 * 
 * Stream.iterate(1, element->{ return element+1;}) //
 * .filter(element->element%5==0) .limit(5) .forEach(System.out::println);
 * 
 * 
 * }
 * 
 * }
 */