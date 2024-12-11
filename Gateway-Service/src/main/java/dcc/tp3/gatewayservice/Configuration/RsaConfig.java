package dcc.tp3.gatewayservice.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;


@ConfigurationProperties(prefix = "rsa")

public record RsaConfig(RSAPublicKey publicKey ) {
}
