package blackjack.dto;

import blackjack.domain.card.Card;
import blackjack.domain.participant.Dealer;
import blackjack.domain.participant.Player;

import java.util.List;

public class CurrentCardsDto {

    private final String name;
    private final List<Card> cards;

    private CurrentCardsDto(String name, List<Card> cards) {
        this.name = name;
        this.cards = cards;
    }

    public static CurrentCardsDto of(Player player) {
        return new CurrentCardsDto(player.getName(), player.getCards());
    }

    public static CurrentCardsDto of(Dealer dealer) {
        return new CurrentCardsDto(dealer.getName(), dealer.getCards().subList(0, 1));
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return cards;
    }
}
