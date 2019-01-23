/*
 * Minecraft Seed Engine
 * By MCCreeper8890
 * 
 * Version: ALPHA 1.0
 * 
 *   Commands
 * ##################################################################################################
 * # genSeed <numSeeds>			-- Generate more seeds										<WIP>	#
 * # evalSeed <numSeeds>		-- Evaluate seeds from a pending list						<WIP>	#
 * #								Subroutines: per seed, test in MC, give description				#
 * # getSeed <description>		-- Get all seeds with a specific description				<WIP>	#
 * #								Listed if it shares a word with input							#
 * # import <fileName>			-- Appends file contents to list of seeds					<WIP>	#
 * # importAll					-- Appends all file contents to list of seeds				<WIP>	#
 * #								Doesn't do anything yet... Come on Alan!						#
 * # export <fileName> <mode>	-- Adds seeds to file										<WIP>	#
 * ##################################################################################################
 * 
 * I call myself "Alan" when I am developing this.
 * 
 */

package mccreeper8890.mcSeedEngine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mccreeper8890.mcSeedEngine.cmd.EvalSeed;
import mccreeper8890.mcSeedEngine.cmd.Export;
import mccreeper8890.mcSeedEngine.cmd.GenSeed;
import mccreeper8890.mcSeedEngine.cmd.GetSeed;
import mccreeper8890.mcSeedEngine.cmd.Import;
import mccreeper8890.mcSeedEngine.cmd.ImportAll;
import mccreeper8890.mcSeedEngine.io.DocumentException;
import mccreeper8890.mcSeedEngine.io.SystemReader;

public class Main {
	
	public static SystemReader systemReader = new SystemReader();						// System input
	public static String command;														// Command from user
	
	public static List<Integer> pendingSeeds = new ArrayList<Integer>();				// Seeds waiting for evaluation
	public static List<Integer> seeds = new ArrayList<Integer>();						// Completed seeds
	public static Map<Integer, String> descriptions = new HashMap<Integer, String>();	// Descriptions
	
	public static void main(String[] args) {
		try {
			
			command = systemReader.readLine();
			
			// The other inputs
			switch(command) {
			case "genSeed":
				GenSeed.call(systemReader);
				break;
			case "evalSeed":
				EvalSeed.call(systemReader);
				break;
			case "getSeed":
				GetSeed.call(systemReader);
				break;
			case "import":
				Import.call(systemReader);
				break;
			case "importAll":
				ImportAll.call(systemReader);
				break;
			case "export":
				Export.call(systemReader);
				break;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
}
