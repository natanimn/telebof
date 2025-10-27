package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Sticker;

/**
 * Contains information about the start page settings of a Telegram Business account.
 * @param title Title text of the business intro
 * @param message Message text of the business intro
 * @param sticker Sticker of the business intro
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record BusinessIntro(String title, String message, Sticker sticker){ }
