package io.github.natanimn.telebof.types.passport;

import java.io.Serializable;

/**
 * <p>
 * <strong>Telegram Passport</strong> is a unified authorization method for services that require personal identification.
 * Users can upload their documents once, then instantly share their data with services that require real-world ID (finance, ICOs, etc.).
 * Please see the <a href="https://core.telegram.org/passport">manual</a> for details.
 * </p>
 * <br>
 * This class describes data required for decrypting and authenticating <a href="https://core.telegram.org/bots/api#encryptedpassportelement">EncryptedPassportElement.</a>
 * @see <a href="https://core.telegram.org/passport#receiving-information">The Telegram Passport Documentation</a> for a complete description of the data decryption and authentication processes.
 * @param data Base64-encoded encrypted JSON-serialized data with unique user's payload, data hashes and secrets required for EncryptedPassportElement decryption and authentication
 * @param hash Base64-encoded data hash for data authentication
 * @param secret Base64-encoded secret, encrypted with the bot's public RSA key, required for data decryption
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record EncryptedCredentials(
        String data,
        String hash,
        String secret
) {}