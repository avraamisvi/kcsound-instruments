
package kcsound.instruments;

import com.google.gson.JsonObject;

/**
 * Created by abraao.
 * Defines how to play an instrument in a score.
 */
public class InstrumentDefinition {
  var id: Int?=null;
  var name: String?=null;
  var label: String?=null;
  var type:  String?=null;
  var mode: Int = 0;
  var pattern: Array<Int>?=null;
  var octave: Int = 1;
  var piano: JsonObject?=null;
}
