package io.github.natanimn.telebof.types.passport;

/**
 * <p>
 * <strong>Telegram Passport</strong> is a unified authorization method for services that require personal identification.
 * Users can upload their documents once, then instantly share their data with services that require real-world ID (finance, ICOs, etc.).
 * Please see the <a href="https://core.telegram.org/passport">manual</a> for details.
 * </p>
 * <br>
 * This class describes data required for decrypting and authenticating <a href="https://core.telegram.org/bots/api#encryptedpassportelement">EncryptedPassportElement.</a>
 * @see <a href="https://core.telegram.org/passport#receiving-information">The Telegram Passport Documentation</a> for a complete description of the data decryption and authentication processes.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class EncryptedCredentials {
    /**
     * Base64-encoded encrypted JSON-serialized data with unique user's payload, data hashes and secrets required for EncryptedPassportElement decryption and authentication
     */
    private String data;

    /**
     * Base64-encoded data hash for data authentication
     */
    private String hash;

    /**
     * Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
     */
    private String secret;

    public String getData() {
        return data;
    }

    public String getHash() {
        return hash;
    }

    public String getSecret() {
        return secret;
    }
}