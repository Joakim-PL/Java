String name; // Dialogruta
String message;
name = JOptionPane.showInputDialog("Vad heter du?");
message = "Välkommen " + name;
JOptionPane.showMessageDialog(null, message);