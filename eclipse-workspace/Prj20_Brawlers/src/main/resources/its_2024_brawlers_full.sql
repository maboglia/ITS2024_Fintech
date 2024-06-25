-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: its_2024
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `brawlers_full`
--

DROP TABLE IF EXISTS `brawlers_full`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brawlers_full` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Brawler` text,
  `Rarity` text,
  `Class` text,
  `Weapon` text,
  `SuperAbility` text,
  `Gadget1` text,
  `Gadget2` text,
  `StarPower1` text,
  `StarPower2` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brawlers_full`
--

LOCK TABLES `brawlers_full` WRITE;
/*!40000 ALTER TABLE `brawlers_full` DISABLE KEYS */;
INSERT INTO `brawlers_full` VALUES (1,'Colette','Chromatic','Damage Dealer','Taxing Shot','Time to Collect','Na-ah!','Gotcha!','Push It','Mass Tax'),(2,'Lola','Chromatic','Damage Dealer','Diamond Eyes','Megalomaniac','Freeze Frame','Stunt Double','Improvise','Sealed With a Kiss'),(3,'Eve','Chromatic','Damage Dealer','Egg Shooter','Baby Boom','Gotta Go!','Motherly Love','Unnatural Order','Happy Surprise'),(4,'R-T','Chromatic','Damage Dealer','Tap Target/Eat Static','Hide And Seek/Radar Waves','In Line','Hacks!','Quick Maths','Recording'),(5,'Spike','Legendary','Damage Dealer','Needle Grenade','Stick Around!','Popping Pincushion','Life Plant','Fertilize','Curveball'),(6,'Chester','Legendary','Damage Dealer','Cap and Bells','Jack in the Box','Spicy Dice','Candy Beans','Bell \'O\' Mania','Sneak Peek'),(7,'Tara','Mythic','Damage Dealer','Triple Tarot','Gravity','Psychic Enhancer','Support from Beyond','Black Portal','Healing Shade'),(8,'Surge','Epic','Damage Dealer','Juice of Justice','Party Tricks','Power Surge','Power Shield','To the Max!','Serve Ice Cold'),(9,'8-Bit','Super Rare','Damage Dealer','Blaster Beams','Damage Booster','Cheat Cartridge','Extra Credits','Boosted Booster','Plugged In'),(10,'Carl','Super Rare','Damage Dealer','Pickaxe','Tailspin','Heat Ejector','Flying Hook','Power Throw','Protective Pirouette'),(11,'Rico','Super Rare','Damage Dealer','Bouncy Bullets','Trick Shot','Super Bouncy','Robo Retreat','Multiball Launcher','Bouncy Castle'),(12,'Nita','Rare','Damage Dealer','Rupture','Overbearing','Bear Paws','Faux Fur','Bear with Me','Hyper Bear'),(13,'Colt','Rare','Damage Dealer','Six-Shooters','Bullet Storm','Speedloader','Silver Bullet','Slick Boots','Magnum Special'),(14,'Shelly','Starting Brawler','Damage Dealer','Buckshot','Super Shell','Shell Shock','Band-Aid','Fast Forward','Clay Pigeons'),(15,'','','','','','','','',''),(16,'Ash','Chromatic','Tank','Buckshot','Super Shell','Chill Pill','Rotten Banana','First Bash','Mad As Heck'),(17,'Buster','Chromatic','Tank','Lens Flare','Montage','Utility Belt','Slo-Mo Replay','Blockbuster','Kevlar Vest'),(18,'Meg','Legendary','Tank','Target Acquired/Crowd Control','Mecha Machina/Feel The Steel','Jolting Volts','Toolbox','Force Field','Heavy Metal'),(19,'Bibi','Epic','Tank','Three Strikes','Spit Ball','Vitamin Booster','Extra Sticky','Home Run','Batting Stance'),(20,'Frank','Epic','Tank','Hammer Hit','Stunning Blow','Active Noise Cancelling','Irresistible Attraction','Power Grab','Sponge'),(21,'Hank','Epic','Tank','Balloon Blast','Fish Torpedo','Waterballoons','Barricade','It\'s Gonna Blow','Take Cover!'),(22,'Darryl','Super Rare','Tank','Double Deuce','Barrel Roll','Steel Hoops','Rolling Reload','Recoiling Rotator','Tar Barrel'),(23,'Jacky','Super Rare','Tank','Groundbreaker','Holey Moley!','Pneumatic Booster','Rebuild','Counter Crush','Hardy Hat'),(24,'Bull','Rare','Tank','Double-Barrel','Bulldozer','T-Bone Injector','Stomper','Berserker','Tough Guy'),(25,'El Primo','Rare','Tank','Fists of Fury','Flying Elbow Drop','Suplex Supplement','Asteroid Belt','El Fuego','Meteor Rush'),(26,'Rosa','Rare','Tank','Hands of Stone','Strong Stuff','Grow Light','Unfriendly Bushes','Plant Life','Thorny Gloves'),(27,'','','','','','','','',''),(28,'Buzz','Chromatic','Assassin','-','-','-','-','-','-'),(29,'Fang','Chromatic','Assassin','-','-','-','-','-','-'),(30,'Sam','Chromatic','Assassin','Heavy Haymakers','Knuckle Busters','Magnetic Field','Pulse Repellent','Hearty Recovery','Remote Recharge'),(31,'Crow','Legendary','Assassin','Switchblade','Swoop','Extra Toxic','Carrion Crow','Defense Booster','Slowing Toxin'),(32,'Leon','Legendary','Assassin','-','-','-','-','-','-'),(33,'Mortis','Mythic','Assassin','-','-','-','-','-','-'),(34,'Edgar','Epic','Assassin','-','-','-','-','-','-'),(35,'Stu','Epic','Assassin','Razzle Dazzle','Nitro Boost','Speed Zone','Breakthrough','Zero Drag','Gaso-Heal'),(36,'','','','','','','','',''),(37,'Ruffs','Chromatic','Support','-','-','-','-','-','-'),(38,'Max','Mythic','Support','-','-','-','-','-','-'),(39,'Byron','Mythic','Support','Careful Dose','Full Treatment','Shot In The Arm','Booster Shots','Malaise','Injection'),(40,'Gray','Mythic','Support','Finger Pistol','Dimensional Doors','Walking Cane','Grand Piano','Fake Injury','New Perspective'),(41,'Pam','Epic','Support','-','-','-','-','-','-'),(42,'Gus','Super Rare','Support','-','-','-','-','-','-'),(43,'Poco','Rare','Support','-','-','-','-','-','-'),(44,'','','','','','','','',''),(45,'Lou','Chromatic','Controller','-','-','-','-','-','-'),(46,'Otis','Chromatic','Controller','Inky Art','Silent Seabed','Dormant Star','Phat Splatter','Stencil Glue','Ink Refills'),(47,'Sandy','Legendary','Controller','Pebble Blast','Sandstorm','Sleep Stimulator','Sweet Dreams','Rude Sands','Healing Winds'),(48,'Amber','Legendary','Controller','-','-','-','-','-','-'),(49,'Gene','Mythic','Controller','-','-','-','-','-','-'),(50,'Mr. P','Mythic','Controller','-','-','-','-','-','-'),(51,'Squeak','Mythic','Controller','-','-','-','-','-','-'),(52,'Willow','Mythic','Controller','Lantern\'s Curse','Hex','Spellbound','Dive','Love Is Blind','Obsession'),(53,'Bo','Epic','Controller','-','-','-','-','-','-'),(54,'Emz','Epic','Controller','-','-','-','-','-','-'),(55,'Griff','Epic','Controller','-','-','-','-','-','-'),(56,'Gale','Epic','Controller','-','-','-','-','-','-'),(57,'Jessie','Super Rare','Controller','Shock Rifle','Scrappy!','Spark Plug','Recoil Spring','Energize','Shocky'),(58,'','','','','','','','',''),(59,'Sprout','Mythic','Artillery','-','-','-','-','-','-'),(60,'Grom','Epic','Artillery','-','-','-','-','-','-'),(61,'Dynamike','Super Rare','Artillery','-','-','-','-','-','-'),(62,'Penny','Super Rare','Artillery','Plunderbuss','Old Lobber','Heavy Coffers','Master Blaster','Salty Barrel','Trusty Spyglass'),(63,'Tick','Super Rare','Artillery','-','-','-','-','-','-'),(64,'Barley','Rare','Artillery','-','-','-','-','-','-'),(65,'','','','','','','','',''),(66,'Belle','Chromatic','Marksman','-','-','-','-','-','-'),(67,'Janet','Chromatic','Marksman','High Note','Crescendo','Drop The Bass','Backstage Pass','Stage View','Vocal Warm Up'),(68,'Mandy','Chromatic','Marksman','Candy Dispenser','Sugar Ray','Caramelize','Cookie Crumbs','In My Sights','Hard Candy'),(69,'Maisie','Chromatic','Marksman','Pressure Rocket','Shockwave','Disengage!','Finish Them!','Pinpoint Precision','Tremors'),(70,'Bea','Epic','Marksman','-','-','-','-','-','-'),(71,'Bonnie','Epic','Marksman','-','-','-','-','-','-'),(72,'Nani','Epic','Marksman','-','-','-','-','-','-'),(73,'Piper','Epic','Marksman','-','-','-','-','-','-'),(74,'Brock','Rare','Marksman','-','-','-','-','-','-');
/*!40000 ALTER TABLE `brawlers_full` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-25 17:25:55
