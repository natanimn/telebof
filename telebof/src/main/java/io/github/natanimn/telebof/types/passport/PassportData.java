package io.github.natanimn.telebof.types.passport;

import java.util.List;

/**
 * <p>
 * Telegram Passport is a unified authorization method for services that require personal identification.
 * Users can upload their documents once, then instantly share their data with services that require real-world ID (finance, ICOs, etc.).
 * Please see the <a href="https://core.telegram.org/passport">manual</a> for details.
 * </p>
 * <br>
 *  This class describes Telegram Passport data shared with the bot by the user.
 * @param data Array with information about documents and other Telegram Passport elements that was shared with the bot
 * @param credentials Encrypted credentials required to decrypt the data
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PassportData(
        List<EncryptedPassportElement> data,
        EncryptedCredentials credentials
)  {}