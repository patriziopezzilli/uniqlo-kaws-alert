package com.cokisnake.uniqlokawsalert;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Timer;
import java.util.TimerTask;


@Service
public class KawsUniqloMonitor {

    @PostConstruct
    public void init() {
        Timer timer = new Timer();
        timer.schedule(new UniqloStockChecker(), 0, 5000);
    }
}

class UniqloStockChecker extends TimerTask {
    HttpClient client = HttpClient.newBuilder().build();

    private String artBook = "{\n" +
            "  \"username\":\"uniqlo-kaws-alert\",\n" +
            "  \"content\": null,\n" +
            "  \"embeds\": [\n" +
            "    {\n" +
            "      \"title\": \"KAWS UT ART BOOK\",\n" +
            "      \"url\": \"https://www.uniqlo.com/it/it/product/libro-darte-kaws-468780.html\",\n" +
            "      \"color\": 16448250,\n" +
            "      \"fields\": [\n" +
            "        {\n" +
            "          \"name\": \"Price\",\n" +
            "          \"value\": \"49.90 €\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Availability\",\n" +
            "          \"value\": \"Instock\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"footer\": {\n" +
            "        \"text\": \"Nicolò Mapelli • Uniqlo\",\n" +
            "        \"icon_url\": \"https://cdn.discordapp.com/attachments/1080880995189915729/1148555999465181205/white.jpg\"\n" +
            "      },\n" +
            "      \"thumbnail\": {\n" +
            "        \"url\": \"https://image.uniqlo.com/UQ/ST3/WesternCommon/imagesgoods/468780/item/goods_99_468780.jpg?width=722&impolicy=quality_70&imformat=chrome\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"attachments\": []\n" +
            "}";

    private String tee1 = "{\n" +
            "  \"username\":\"uniqlo-kaws-alert\",\n" +
            "  \"content\": null,\n" +
            "  \"embeds\": [\n" +
            "    {\n" +
            "      \"title\": \"KAWS UT GRAPHIC T-SHIRT\",\n" +
            "      \"url\": \"https://www.uniqlo.com/it/it/product/t-shirt-stampa-ut-kaws-467525.html\",\n" +
            "      \"color\": 16448250,\n" +
            "      \"fields\": [\n" +
            "        {\n" +
            "          \"name\": \"Price\",\n" +
            "          \"value\": \"19.90 €\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Availability\",\n" +
            "          \"value\": \"Instock\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"footer\": {\n" +
            "        \"text\": \"Nicolò Mapelli • Uniqlo\",\n" +
            "        \"icon_url\": \"https://cdn.discordapp.com/attachments/1080880995189915729/1148555999465181205/white.jpg\"\n" +
            "      },\n" +
            "      \"thumbnail\": {\n" +
            "        \"url\": \"https://image.uniqlo.com/UQ/ST3/eu/imagesgoods/467525/item/eugoods_00_467525.jpg?width=722&impolicy=quality_70&imformat=chrome\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"attachments\": []\n" +
            "}";

    private String tee2 = "{\n" +
            "  \"username\":\"uniqlo-kaws-alert\",\n" +
            "  \"content\": null,\n" +
            "  \"embeds\": [\n" +
            "    {\n" +
            "      \"title\": \"KAWS UT GRAPHIC T-SHIRT\",\n" +
            "      \"url\": \"https://www.uniqlo.com/it/it/product/t-shirt-stampa-ut-kaws-467774.html\",\n" +
            "      \"color\": 16448250,\n" +
            "      \"fields\": [\n" +
            "        {\n" +
            "          \"name\": \"Price\",\n" +
            "          \"value\": \"19.90 €\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Availability\",\n" +
            "          \"value\": \"Instock\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"footer\": {\n" +
            "        \"text\": \"Nicolò Mapelli • Uniqlo\",\n" +
            "        \"icon_url\": \"https://cdn.discordapp.com/attachments/1080880995189915729/1148555999465181205/white.jpg\"\n" +
            "      },\n" +
            "      \"thumbnail\": {\n" +
            "        \"url\": \"https://image.uniqlo.com/UQ/ST3/eu/imagesgoods/467774/item/eugoods_00_467774.jpg?width=722&impolicy=quality_70&imformat=chrome\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"attachments\": []\n" +
            "}";

    private String tee3 = "{\n" +
            "  \"username\":\"uniqlo-kaws-alert\",\n" +
            "  \"content\": null,\n" +
            "  \"embeds\": [\n" +
            "    {\n" +
            "      \"title\": \"KAWS UT GRAPHIC T-SHIRT\",\n" +
            "      \"url\": \"https://www.uniqlo.com/it/it/product/t-shirt-stampa-ut-kaws-467775.html\",\n" +
            "      \"color\": 16448250,\n" +
            "      \"fields\": [\n" +
            "        {\n" +
            "          \"name\": \"Price\",\n" +
            "          \"value\": \"19.90 €\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Availability\",\n" +
            "          \"value\": \"Instock\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"footer\": {\n" +
            "        \"text\": \"Nicolò Mapelli • Uniqlo\",\n" +
            "        \"icon_url\": \"https://cdn.discordapp.com/attachments/1080880995189915729/1148555999465181205/white.jpg\"\n" +
            "      },\n" +
            "      \"thumbnail\": {\n" +
            "        \"url\": \"https://image.uniqlo.com/UQ/ST3/eu/imagesgoods/467775/item/eugoods_09_467775.jpg?width=722&impolicy=quality_70&imformat=chrome\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"attachments\": []\n" +
            "}";

    private String hoodie1 = "{\n" +
            "  \"username\":\"uniqlo-kaws-alert\",\n" +
            "  \"content\": null,\n" +
            "  \"embeds\": [\n" +
            "    {\n" +
            "      \"title\": \"KAWS UT GRAPHIC HOODIE\",\n" +
            "      \"url\": \"https://www.uniqlo.com/it/it/product/felpa-stampa-ut-kaws-467395.html\",\n" +
            "      \"color\": 16448250,\n" +
            "      \"fields\": [\n" +
            "        {\n" +
            "          \"name\": \"Price\",\n" +
            "          \"value\": \"34.90 €\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Availability\",\n" +
            "          \"value\": \"Instock\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"footer\": {\n" +
            "        \"text\": \"Nicolò Mapelli • Uniqlo\",\n" +
            "        \"icon_url\": \"https://cdn.discordapp.com/attachments/1080880995189915729/1148555999465181205/white.jpg\"\n" +
            "      },\n" +
            "      \"thumbnail\": {\n" +
            "        \"url\": \"https://image.uniqlo.com/UQ/ST3/eu/imagesgoods/467395/item/eugoods_01_467395.jpg?width=722&impolicy=quality_70&imformat=chrome\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"attachments\": []\n" +
            "}";
    private String hoodie2 = "{\n" +
            "  \"username\":\"uniqlo-kaws-alert\",\n" +
            "  \"content\": null,\n" +
            "  \"embeds\": [\n" +
            "    {\n" +
            "      \"title\": \"KAWS UT GRAPHIC HOODIE\",\n" +
            "      \"url\": \"https://www.uniqlo.com/it/it/product/felpa-stampa-ut-kaws-467773.html\",\n" +
            "      \"color\": 16448250,\n" +
            "      \"fields\": [\n" +
            "        {\n" +
            "          \"name\": \"Price\",\n" +
            "          \"value\": \"34.90 €\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Availability\",\n" +
            "          \"value\": \"Instock\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"footer\": {\n" +
            "        \"text\": \"Nicolò Mapelli • Uniqlo\",\n" +
            "        \"icon_url\": \"https://cdn.discordapp.com/attachments/1080880995189915729/1148555999465181205/white.jpg\"\n" +
            "      },\n" +
            "      \"thumbnail\": {\n" +
            "        \"url\": \"https://image.uniqlo.com/UQ/ST3/eu/imagesgoods/467773/item/eugoods_09_467773.jpg?width=722&impolicy=quality_70&imformat=chrome\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"attachments\": []\n" +
            "}";

    private String mention = "{ \n" +
            "  \"username\":\"uniqlo-kaws-alert\",\n" +
            "  \"content\": \"@everyone\",\n" +
            "  \"embeds\": null,\n" +
            "  \"attachments\": []\n" +
            "}";

    private boolean checkAvailable() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.uniqlo.com/on/demandware.store/Sites-EU-Site/en/Product-GetVariants?pid=467525&Quantity=1"))
                .GET()
                .setHeader("Accept", "*/*")
                .setHeader("Accept-Language", "en-US,en;q=0.9")
                .setHeader("Referer", "https://www.uniqlo.com/eu/en/product/kaws-ut-graphic-t-shirt-467774.html?dwvar_467774_size=SMA005&dwvar_467774_color=COL00")
                .setHeader("Sec-Fetch-Dest", "empty")
                .setHeader("Sec-Fetch-Mode", "cors")
                .setHeader("Sec-Fetch-Site", "same-origin")
                .setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36 Edg/114.0.1823.55")
                .setHeader("sec-ch-ua", "\"Not.A/Brand\";v=\"8\", \"Chromium\";v=\"114\", \"Microsoft Edge\";v=\"114\"")
                .setHeader("sec-ch-ua-mobile", "?0")
                .setHeader("sec-ch-ua-platform", "\"Windows\"")
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            return response.body().contains("Coming Soon");
        } catch (Exception e) {
            System.out.println("> ERROR");
            return false;
        }
    }

    private void sendDiscordMessage(String content) {
        HttpRequest webhook = HttpRequest.newBuilder()
                .uri(URI.create("https://discord.com/api/webhooks/1148234602327068763/GSEfAdVODnsaDPOKeNWAipQGp-G_wNl2IUD2gvU3J23cRrQHBDlP-t2PcCN94QJIux0c"))
                .POST(HttpRequest.BodyPublishers.ofString(content))
                .setHeader("Accept", "*/*")
                .setHeader("Content-Type", "application/json")
                .setHeader("Accept-Language", "en-US,en;q=0.9")
                .build();
        try {
            HttpResponse<String> webhookResponse = client.send(webhook, HttpResponse.BodyHandlers.ofString());
            System.out.println(webhookResponse.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void run() {
        System.out.println("> KAWS MONITOR STARTED <");

        if (checkAvailable()) {
            // send webhook
            sendDiscordMessage(artBook);
            sendDiscordMessage(tee1);
            sendDiscordMessage(tee2);
            sendDiscordMessage(tee3);
            sendDiscordMessage(hoodie1);
            sendDiscordMessage(hoodie2);
            sendDiscordMessage(mention);

            System.exit(1);
        }

        System.out.println("> KAWS MONITOR ENDED <");
    }
}