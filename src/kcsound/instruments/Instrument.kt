package kcsound.instruments;

import com.google.gson.JsonObject;

/**
 * Created by abraao on 6/2/15.
 */
interface Instrument {

    /**
     * Unique identification
     */
    val type: String;

    /**
     * Generate body content.
     */
    fun body():String;

    /**
     * Generate globals to be added to the score.
     */
    fun globals():String;

    /**
     * Compiles the instrument.
     */
    fun compile(data:JsonObject)
}
