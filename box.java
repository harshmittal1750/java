class box {
    double width, height, depth;

    // constructor used when all dimensions
    // specified
    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}