package io.github.natanimn.types.passport;

import java.io.Serializable;
import java.util.Objects;

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
 * @version 0.7
 */
public class EncryptedCredentials implements Serializable {
    /**
     * Base64-encoded encrypted JSON-serialized data with unique user's payload, data hashes and secrets required for
     * <a href="https://core.telegram.org/bots/api#encryptedpassportelement">EncryptedPassportElement</a> decryption and authentication
     */
    public String data;

    /**
     * Base64-encoded data hash for data authentication
     */
    public String hash;

    /**
     * Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
     */
    public String secret;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EncryptedCredentials that = (EncryptedCredentials) object;
        return  Objects.equals(data, that.data) &&
                Objects.equals(hash, that.hash) &&
                Objects.equals(secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, hash, secret);
    }
}
