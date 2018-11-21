module okcurl {
    requires okhttp;
    requires guava;
    requires airline;
    opens okcurl to airline;
}