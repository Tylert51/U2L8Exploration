public class Circle {
        private double radius;

        public Circle(double radius)
        {
            this.radius = radius;
        }

        /* Returns the area of the circle with given radius
           Area of a circle = pi * r ^ 2
         */
        public double area() {
        return Math.PI * Math.pow(radius,2);
        }

        /* Returns the circumference of the circle with given radius
           Circumference of a circle = pi * d
           (d = diameter = 2 * r)
         */
        public double circumference() {
        return Math.PI * (radius * 2);
        }

        /* Updates the radius of the circle to newRadius
         */
        public void setRadius(double newRadius)
        {
            radius = newRadius;
        }

        /* Returns a String that includes info about the circle,
           including its radius, area, and circumference on separate lines;
           see example output below
         */
        public String toString() {
            return "radius = " + radius + "\narea = " + area() + "\ncircumference = " + circumference();
        }
    }
