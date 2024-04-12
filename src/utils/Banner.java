package utils;

public enum Banner {

    LOGO("""
             ██████╗ ██████╗ ████████╗ ██████╗ ██████╗  █████╗ ██╗   ██╗
            ██╔════╝██╔═══██╗╚══██╔══╝██╔═══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝
            ██║     ██║   ██║   ██║   ██║   ██║██║  ██║███████║ ╚████╔╝
            ██║     ██║   ██║   ██║   ██║   ██║██║  ██║██╔══██║  ╚██╔╝
            ╚██████╗╚██████╔╝   ██║   ╚██████╔╝██████╔╝██║  ██║   ██║
             ╚═════╝ ╚═════╝    ╚═╝    ╚═════╝ ╚═════╝ ╚═╝  ╚═╝   ╚═╝"""),

    COTACAO(""),
    CONVERSAO("");

    private final String bannerText;

    Banner(String bannerText) {
        this.bannerText = bannerText;
    }

    public String getBannerText() {
        return bannerText;
    }

}
