public class Arithmetic {
    int a;
    int b;

    Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum () {
        return a + b;
    }

    int multiple () {
        return a * b;
    }

    int max () {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return b;
        }
    }

    int min () {
        if (a < b) {
            return a;
        } else if (a > b) {
            return b;
        } else {
            return b;
        }
    }
}
