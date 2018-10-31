import java.text.*;

def count = 1;
def sb = new StringBuffer("\n");

def s = NumberFormat.getInstance().format(1.20); // Depends on default Locale
sb.append(count++).append(": ").append(s).append("\n");

s = NumberFormat.getInstance(Locale.ITALY).format(1.50); // 1,234
sb.append(count++).append(": ").append(s).append("\n");

s = new DecimalFormat("#.00").format(1.00); // Depends on default Locale, 2 decimal places
sb.append(count++).append(": ").append(s).append("\n");

s = String.format("Numero es %.2f", 1.20); // Depends on default Locale
sb.append(count++).append(": ").append(s).append("\n");

s = "Numero es " + 1.234; // 1.234 - always uses the dot
sb.append(count++).append(": ").append(s).append("\n");







import java.text.*;

double s = 12.00

def a = String.format("%.2f", s).replace('.' , ',')






import java.text.*;

def count = 1;
def sb = new StringBuffer("\n");

def s = NumberFormat.getInstance().format(1.40); // Depends on default Locale
sb.append(count++).append(": ").append(s).append("\n");

s = NumberFormat.getInstance(Locale.GERMANY).format(1.40); // 1,234
sb.append(count++).append(": ").append(s).append("\n");

s = new DecimalFormat("#.##").format(1.40); // Depends on default Locale, 2 decimal places
sb.append(count++).append(": ").append(s).append("\n");

s = String.format("My number is %.3f", 1.40); // Depends on default Locale
sb.append(count++).append(": ").append(s).append("\n");

s = "My number is " + 1.40; // 1.234 - always uses the dot
sb.append(count++).append(": ").append(s).append("\n");