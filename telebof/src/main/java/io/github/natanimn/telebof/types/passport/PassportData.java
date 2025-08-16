package io.github.natanimn.telebof.types.passport;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * Telegram Passport is a unified authorization method for services that require personal identification.
 * Users can upload their documents once, then instantly share their data with services that require real-world ID (finance, ICOs, etc.).
 * Please see the <a href="https://core.telegram.org/passport">manual</a> for details.
 * </p>
 * <br>
 *  This class describes Telegram Passport data shared with the bot by the user.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportData implements Serializable {
    /**
     * Array with information about documents and other Telegram Passport elements that was shared with the bot
     */
    public List<EncryptedPassportElement> data;

    /**
     * Encrypted credentials required to decrypt the data
     */
    public EncryptedCredentials credentials;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PassportData that = (PassportData) object;
        return Objects.equals(data, that.data) && Objects.equals(credentials, that.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, credentials);
    }
}
