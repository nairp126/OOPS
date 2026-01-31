// Package removed to match directory structure

// 1. The OLD System (Incompatible Interface)
class OldPrinter {
    public void printOldWay(String text) {
        System.out.println("Legacy Print: " + text);
    }
}

// 2. The NEW Interface (What our app expects)
interface ModernPrinter {
    void print(String text);
}

// 3. The Adapter (Wrapper)
// It implements the NEW interface, but calls the OLD method internally.
class PrinterAdapter implements ModernPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        // Translate the call
        oldPrinter.printOldWay(text);
    }
}

/**
 * Adapter Pattern.
 * 
 * Concept: Making two incompatible interfaces work together.
 * Analogy: A USB-C to USB-A dongle.
 */
public class LegacyAdapter {
    public static void main(String[] args) {
        // Our app only knows how to use 'ModernPrinter'
        OldPrinter oldHardware = new OldPrinter();

        ModernPrinter printer = new PrinterAdapter(oldHardware);

        printer.print("Hello Adapter Pattern!");
        // Output: Legacy Print: Hello Adapter Pattern!
    }
}
