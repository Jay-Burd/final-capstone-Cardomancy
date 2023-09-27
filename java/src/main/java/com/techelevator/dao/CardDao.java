package com.techelevator.dao;

import com.techelevator.model.Card;

import java.util.List;

//This interface will define the methods needed for any class to be identified as a Card data access object
public interface CardDao {


    /**
     * Method to query a card object using a card's ID
     * as a search parameter
     *
     * @param cardID card ID to search by
     * @return Card object that exactly matches the search parameter
     */
    Card getCardById(String cardID);


    //ToDO remove this method in subsequent sprint
//    /**
//     * Method to query a card object using a card's
//     * title as a search parameter
//     *
//     * @param cardTitle card title to search by
//     * @return Card object that exactly matches the search parameter
//     */
//    Card getCardByTitle(String cardTitle);


    /**
     * Method to query a list of cards using a card
     * title as a search parameter.
     * @param cardTitle card title to search by
     * @param isExactMatch boolean determining if an exact match is needed
     * @return List of card objects that may match the search parameter
     */
    List<Card> getCardsByTitle(String cardTitle, boolean isExactMatch);



    /**
     * Method to add a new card to source.
     *
     * @param cardToBeAdded card object to be added
     * @return returns the card object directly queried from the source
     */
    Card addCard(Card cardToBeAdded);



}