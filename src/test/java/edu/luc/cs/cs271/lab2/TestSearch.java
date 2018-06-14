package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture
  ArrayList<Team> makeListFixture() {
    final ArrayList<Team> list = new ArrayList<>();
    int i = 0;
    while(i<10) {
      final String s = Integer.toString(i);
      list.add(new Team("Team " + s, "Coach " + s, i * 100 + 50));
      i++;
    }
    return list;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0() {
    final ArrayList<Team> list = makeListFixture();
    assertTrue(Search.findTeamPosition(list,"Team 0").isPresent());
  }

  @Test
  public void testFindPositionList10s() {
    final ArrayList<Team> list = makeListFixture();
    assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10f() {
    final ArrayList<Team> list = makeListFixture();
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }


  // TODO: testFindMinFundingArray for several sizes and scenarios

  //  MakeFundingFixture
  Team[] makeFundingFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  @Test
  public void testFindMinFundingArray0()  {
    final Team[] arr = makeFundingFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 50).isPresent());
  }

  @Test
  public void testFindMinFundingArray3()  {
    final Team[] arr = makeFundingFixture(3);
    assertTrue(Search.findTeamMinFunding(arr, 100).isPresent());
  }

  @Test
  public void testFindMinFundingArrayNotPresent()  {
    final Team[] arr = makeFundingFixture(5);
    assertFalse(Search.findTeamMinFunding(arr, 1000).isPresent());
  }


  // TODO: testFindMinFundingArrayFast for several sizes and scenarios
  @Test
  public void testFindMinFundingArrayFast3()  {
    final Team[] arr = makeFundingFixture(3);
    assertTrue(Search.findTeamMinFundingFast(arr, 50).isPresent());
  }

  @Test
  public void testFindMinFundingArrayFastNotFound()  {
    final Team[] arr = makeFundingFixture(5);
    assertFalse(Search.findTeamMinFundingFast(arr, 10000).isPresent());
  }

  @Test
  public void testFindMinFundingArrayFast0()  {
    final Team[] arr = makeFundingFixture(0);
    assertFalse(Search.findTeamMinFundingFast(arr, 50).isPresent());
  }

}
