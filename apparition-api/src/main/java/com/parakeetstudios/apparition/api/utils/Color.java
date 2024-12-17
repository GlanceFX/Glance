package com.parakeetstudios.apparition.api.utils;

public record Color(
        int alpha,
        int red,
        int green,
        int blue
) {

   public Color {
       alpha = Math.clamp(alpha, 0, 255);
       red = Math.clamp(red, 0, 255);
       green = Math.clamp(green, 0, 255);
       blue = Math.clamp(blue, 0, 255);
   }

   public int toARGB() {
       return (alpha << 24) | (red << 16) | (green << 8) | blue;
   }

   public Color withAlpha(int alpha) {
       return new Color(alpha, this.red, this.green, this.blue);
   }

   /* Factory Methods */

    public static Color fromARGB(int argb) {
        return new Color(
                (argb >> 24) & 0xFF,
                (argb >> 16) & 0xFF,
                (argb >> 8) & 0xFF,
                argb & 0xFF
        );
    }

    public static Color fromHex(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        int argb = (hex.length() == 8)
                ? (int) Long.parseLong(hex, 16)
                : (0xFF000000) | Integer.parseInt(hex, 16);
        return Color.fromARGB(argb);
    }

    public static Color transparent() {
        return new Color(0, 0, 0, 0);
    }

    public static Color white() {
        return new Color(255, 255, 255, 255);
    }

    @Override
    public String toString() {
        return String.format("Color{A=%d, R=%d, G=%d, B=%d}", alpha, red, green, blue);
    }

}
