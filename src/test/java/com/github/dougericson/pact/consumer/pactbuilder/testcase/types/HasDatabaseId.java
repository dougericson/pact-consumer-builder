package com.github.dougericson.pact.consumer.pactbuilder.testcase.types;

public interface HasDatabaseId {

  /**
   * Liefert die ID, die in der Datenbank gespeichert werden soll, um dieses Objekt zu
   * referenzieren.
   */
  String getDatabaseId();

}
