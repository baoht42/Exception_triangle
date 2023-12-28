public class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public static void checkTriangle(int a, int b, int c) throws Exception {
        if (a <=0 || b <=0 || c <= 0) {
            System.out.println("Hay nhap lai!!");
        }
        if ((a + b) < c && (c + b) < a && (c + a) < c) {
            System.out.println("Khong phai la tam giac");
        }

    }

        public int getA () {
            return a;
        }

        public void setA ( int a){
            this.a = a;
        }

        public int getB () {
            return b;
        }

        public void setB ( int b){
            this.b = b;
        }

        public int getC () {
            return c;
        }

        public void setC ( int c){
            this.c = c;
        }

    }

