/***
 * Excerpted from "Pragmatic Unit Testing in Java with JUnit",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/utj2 for more book information.
***/
package org.practice.test_09;
import org.practice.examples_09.*;

import org.junit.*;
import static org.junit.Assert.*;

public class ProfileTest {
   @Test
   public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
      Profile profile = new Profile("Bull Hockey, Inc.");
      Question question = new BooleanQuestion(1, "Got bonuses?");
      Answer profileAnswer = new Answer(question, Bool.FALSE);
      profile.add(profileAnswer);      
      Criteria criteria = new Criteria();
      Answer criteriaAnswer = new Answer(question, Bool.TRUE);
      Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
      criteria.add(criterion);

      boolean matches = profile.matches(criteria);
      
      assertFalse(matches);
   }
   
   @Test
   public void matchAnswersTrueForAnyDontCareCriteria() {
      Profile profile = new Profile("Bull Hockey, Inc.");
      Question question = new BooleanQuestion(1, "Got milk?");
      Answer profileAnswer = new Answer(question, Bool.FALSE);
      profile.add(profileAnswer);      
      Criteria criteria = new Criteria();
      Answer criteriaAnswer = new Answer(question, Bool.TRUE);
      Criterion criterion = new Criterion(criteriaAnswer, Weight.DontCare);
      criteria.add(criterion);

      boolean matches = profile.matches(criteria);
      assertTrue(matches);
   }
}
