package io.github.natanimn.types.passport;

import java.io.Serializable;
import java.util.Objects;

/**
 * <p>
 * <strong>Telegram Passport</strong> is a unified authorization method for services that require personal identification.
 * Users can upload their documents once, then instantly share their data with services that require real-world ID (finance, ICOs, etc.).
 * Please see the <a href="https://core.telegram.org/passport">manual</a> for details.
 * </p>
 *<br>
 * This class represents a file uploaded to Telegram Passport.
 * Currently, all Telegram Passport files are in JPEG format when decrypted and don't exceed 10MB.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportFile  implements Serializable {
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    public String file_id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    public String file_unique_id;

    /**
     * File size in bytes
     */
    public Integer file_size;

    /**
     * Unix time when the file was uploaded
     */
    public Integer file_date;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PassportFile that = (PassportFile) object;
        return  Objects.equals(file_id, that.file_id) &&
                Objects.equals(file_unique_id, that.file_unique_id) &&
                Objects.equals(file_size, that.file_size) &&
                Objects.equals(file_date, that.file_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, file_size, file_date);
    }
}
