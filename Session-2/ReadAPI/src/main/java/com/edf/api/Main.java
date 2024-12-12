package com.edf.api;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.util.StreamUtils;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static java.nio.charset.Charset.defaultCharset;

public class Main {

    public static void main(String[] args) throws IOException {
        WireMockServer wireMockServer = new WireMockServer(options().port(8080));
        wireMockServer.start();

        wireMockServer.stubFor(get(urlEqualTo("/books"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(
                                StreamUtils.copyToString(
                                        Main.class.getClassLoader().getResourceAsStream("books-response.json"),
                                        defaultCharset()))));;

    }
}
