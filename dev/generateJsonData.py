MOD_ID = "beautifulcarpets"
MOD_ASSETS_PATH = f"..\\src\\main\\resources\\assets\\{MOD_ID}"
MOD_DATA_PATH = f"..\\src\\main\\resources\\data\\{MOD_ID}"

colorPalette = [
	[
		"red",
		["red"]
	],
	[
		"orange",
		["orange"]
	],
	[
		"yellow",
		["yellow"]
	],
	[
		"olive",
		["yellow", "green"]
	],
	[
		"green",
		["green"]
	],
	[
		"seagreen",
		["green", "emerald"]
	],
	[
		"emerald",
		["cyan"]
	],
	[
		"aquamarine",
		["light_blue"]
	],
	[
		"blue",
		["blue"]
	],
	[
		"cobaltblue",
		["blue", "emerald"]
	],
	[
		"midnight",
		["blue", "violet"]
	],
	[
		"violet",
		["purple"]
	],
	[
		"purple",
		["magenta"]
	],
	[
		"orchid",
		["pink"]
	],
	[
		"black",
		["black"]
	],
	[
		"gray",
		["gray"]
	]
]

ornamentTypes = ["gold", "silver", "copper"]
ornamentTags = ["c:nuggets/gold", "c:nuggets/iron", "c:nuggets/copper"]

def getBlockstatesJson(modColor, ornamentType, isCarpet):
	return f"""{{
	"variants":
	{{
		"": {{ "model": "{MOD_ID}:block/{modColor}_{ornamentType}_moquette{'_carpet' if isCarpet else ''}" }}
	}}
}}"""

def getBlockModelJson(modColor, ornamentType, isCarpet):
	return f"""{{
		"parent": "minecraft:block/{'carpet' if isCarpet else 'cube_all'}",
		"textures": {{ "{'wool' if isCarpet else 'all'}": "{MOD_ID}:block/{modColor}_{ornamentType}_moquette" }}
	}}"""

def getItemModelJson(modColor, ornamentType, isCarpet):
	return f"""{{
		"parent": "{MOD_ID}:block/{modColor}_{ornamentType}_moquette{'_carpet' if isCarpet else ''}"
	}}"""

def getMoquetteCraftJson(modColorIndex, ornamentIndex):
	modColor = colorPalette[modColorIndex][0]
	colors = colorPalette[modColorIndex][1]
	ornamentType = ornamentTypes[ornamentIndex]
	ornamentTag = ornamentTags[ornamentIndex]

	if len(colors) == 1:
		return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "carpet",
	"ingredients": [
		{{ "tag": "{ornamentTag}" }},
		{{ "item": "minecraft:{colors[0]}_wool" }}
	],
	"result":
	{{
		"count": 1,
		"id": "{MOD_ID}:{modColor}_{ornamentType}_moquette"
	}}
}}"""
	elif len(colors) == 2:
		return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "carpet",
	"ingredients": [
		{{ "item": "{MOD_ID}:{colors[0]}_{ornamentType}_moquette" }},
		{{ "item": "{MOD_ID}:{colors[1]}_{ornamentType}_moquette" }}
	],
	"result":
	{{
		"count": 2,
		"id": "{MOD_ID}:{modColor}_{ornamentType}_moquette"
	}}
}}"""
	else:
		print("Watch your palette - a color must consist of at least 1, and 2 at maximum colors")
		return ""

def getMoquetteCarpetCraftJson(modColor, ornamentType):
	return f"""{{
	"type": "minecraft:crafting_shaped",
	"category": "misc",
	"group": "carpet",
	"key":
	{{
		"#": {{ "item": "{MOD_ID}:{modColor}_{ornamentType}_moquette" }}
	}},
	"pattern": ["##"],
	"result":
	{{
		"count": 3,
		"id": "{MOD_ID}:{modColor}_{ornamentType}_moquette_carpet"
	}}
}}"""

def getMoquetteCarpetCraftFromCarpetsJson(modColorIndex, ornamentIndex):
	modColor = colorPalette[modColorIndex][0]
	colors = colorPalette[modColorIndex][1]
	ornamentType = ornamentTypes[ornamentIndex]
	ornamentTag = ornamentTags[ornamentIndex]

	return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "carpet",
	"ingredients": [
		{{ "item": "minecraft:{colors[0]}_carpet" }},
		{{ "item": "minecraft:{colors[0]}_carpet" }},
		{{ "item": "minecraft:{colors[0]}_carpet" }},
		{{ "tag": "{ornamentTag}" }},
		{{ "tag": "{ornamentTag}" }}
	],
	"result":
	{{
		"count": 3,
		"id": "{MOD_ID}:{modColor}_{ornamentType}_moquette_carpet"
	}}
}}"""

counter = 0

for colorIndex in range(len(colorPalette)):
	for ornamentIndex in range(len(ornamentTypes)):
		for carpetOrNot in range(2):
			modColor = colorPalette[colorIndex][0]
			ornamentType = ornamentTypes[ornamentIndex]
			isCarpet = carpetOrNot == 1
			filename = f"{modColor}_{ornamentType}_moquette{'_carpet' if isCarpet else ''}"

			# Blockstates
			f = open(f"{MOD_ASSETS_PATH}\\blockstates\\{filename}.json", "w", encoding="utf-8")
			f.write(getBlockstatesJson(modColor, ornamentType, isCarpet))
			f.close()

			# Block model
			f = open(f"{MOD_ASSETS_PATH}\\models\\block\\{filename}.json", "w", encoding="utf-8")
			f.write(getBlockModelJson(modColor, ornamentType, isCarpet))
			f.close()

			# Item model
			f = open(f"{MOD_ASSETS_PATH}\\models\\item\\{filename}.json", "w", encoding="utf-8")
			f.write(getItemModelJson(modColor, ornamentType, isCarpet))
			f.close()

			recipeFilePath = f"{MOD_DATA_PATH}\\recipe\\{filename}.json"

			if isCarpet:
				# Carpets crafts
				with open(recipeFilePath, "w", encoding="utf-8") as f:
					f.write(getMoquetteCarpetCraftJson(modColor, ornamentType))

				with open(f"{recipeFilePath.replace('.json', '_from_carpets.json')}", "w", encoding="utf-8") as f:
					f.write(getMoquetteCarpetCraftFromCarpetsJson(colorIndex, ornamentIndex))
			else:
				# Blocks crafts
				with open(recipeFilePath, "w", encoding="utf-8") as f:
					f.write(getMoquetteCraftJson(colorIndex, ornamentIndex))

			counter += 1

print(f"Generated data for {counter} items")