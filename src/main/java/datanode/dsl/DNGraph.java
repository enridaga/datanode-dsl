package datanode.dsl;
public abstract class DNGraph implements Walkable, Measurable {public abstract DNGraph arc(String id);
public abstract DNGraph node(String id);

public final static String relatedWith = "relatedWith";
public final DNGraph relatedWith(){return arc(relatedWith);}
public final static String sharesInterpretationWith = "sharesInterpretationWith";
public final DNGraph sharesInterpretationWith(){return arc(sharesInterpretationWith);}
public final static String overlappingCapabilityWith = "overlappingCapabilityWith";
public final DNGraph overlappingCapabilityWith(){return arc(overlappingCapabilityWith);}
public final static String touch = "touch";
public final DNGraph touch(){return arc(touch);}
public final static String overlappingPopulationWith = "overlappingPopulationWith";
public final DNGraph overlappingPopulationWith(){return arc(overlappingPopulationWith);}
public final static String hasDerivation = "hasDerivation";
public final DNGraph hasDerivation(){return arc(hasDerivation);}
public final static String isDerivationOf = "isDerivationOf";
public final DNGraph isDerivationOf(){return arc(isDerivationOf);}
public final static String overlappingVocabularyWith = "overlappingVocabularyWith";
public final DNGraph overlappingVocabularyWith(){return arc(overlappingVocabularyWith);}
public final static String samePopulationAs = "samePopulationAs";
public final DNGraph samePopulationAs(){return arc(samePopulationAs);}
public final static String versionOf = "versionOf";
public final DNGraph versionOf(){return arc(versionOf);}
public final static String sameVocabularyAs = "sameVocabularyAs";
public final DNGraph sameVocabularyAs(){return arc(sameVocabularyAs);}
public final static String processedFrom = "processedFrom";
public final DNGraph processedFrom(){return arc(processedFrom);}
public final static String sameCapabilityAs = "sameCapabilityAs";
public final DNGraph sameCapabilityAs(){return arc(sameCapabilityAs);}
public final static String processedInto = "processedInto";
public final DNGraph processedInto(){return arc(processedInto);}
public final static String adjacentTo = "adjacentTo";
public final DNGraph adjacentTo(){return arc(adjacentTo);}
public final static String sameIdentityAs = "sameIdentityAs";
public final DNGraph sameIdentityAs(){return arc(sameIdentityAs);}
public final static String hasPart = "hasPart";
public final DNGraph hasPart(){return arc(hasPart);}
public final static String isPartOf = "isPartOf";
public final DNGraph isPartOf(){return arc(isPartOf);}
public final static String differentCapabilityFrom = "differentCapabilityFrom";
public final DNGraph differentCapabilityFrom(){return arc(differentCapabilityFrom);}
public final static String hasVocabulary = "hasVocabulary";
public final DNGraph hasVocabulary(){return arc(hasVocabulary);}
public final static String isVocabularyOf = "isVocabularyOf";
public final DNGraph isVocabularyOf(){return arc(isVocabularyOf);}
public final static String isUpdateOf = "isUpdateOf";
public final DNGraph isUpdateOf(){return arc(isUpdateOf);}
public final static String hasUpdate = "hasUpdate";
public final DNGraph hasUpdate(){return arc(hasUpdate);}
public final static String references = "references";
public final DNGraph references(){return arc(references);}
public final static String metadata = "metadata";
public final DNGraph metadata(){return arc(metadata);}
public final static String about = "about";
public final DNGraph about(){return arc(about);}
public final static String referencedBy = "referencedBy";
public final DNGraph referencedBy(){return arc(referencedBy);}
public final static String hasInterpretation = "hasInterpretation";
public final DNGraph hasInterpretation(){return arc(hasInterpretation);}
public final static String hasStandIn = "hasStandIn";
public final DNGraph hasStandIn(){return arc(hasStandIn);}
public final static String hasDescriptors = "hasDescriptors";
public final DNGraph hasDescriptors(){return arc(hasDescriptors);}
public final static String hasChange = "hasChange";
public final DNGraph hasChange(){return arc(hasChange);}
public final static String newerVersionOf = "newerVersionOf";
public final DNGraph newerVersionOf(){return arc(newerVersionOf);}
public final static String hasCopy = "hasCopy";
public final DNGraph hasCopy(){return arc(hasCopy);}
public final static String olderVersionOf = "olderVersionOf";
public final DNGraph olderVersionOf(){return arc(olderVersionOf);}
public final static String isChangeOf = "isChangeOf";
public final DNGraph isChangeOf(){return arc(isChangeOf);}
public final static String isInterpretationOf = "isInterpretationOf";
public final DNGraph isInterpretationOf(){return arc(isInterpretationOf);}
public final static String differentPopulationFrom = "differentPopulationFrom";
public final DNGraph differentPopulationFrom(){return arc(differentPopulationFrom);}
public final static String isStandInOf = "isStandInOf";
public final DNGraph isStandInOf(){return arc(isStandInOf);}
public final static String descriptorsOf = "descriptorsOf";
public final DNGraph descriptorsOf(){return arc(descriptorsOf);}
public final static String isCopyOf = "isCopyOf";
public final DNGraph isCopyOf(){return arc(isCopyOf);}
public final static String differentVocabularyFrom = "differentVocabularyFrom";
public final DNGraph differentVocabularyFrom(){return arc(differentVocabularyFrom);}
public final static String disjointPartWith = "disjointPartWith";
public final DNGraph disjointPartWith(){return arc(disjointPartWith);}
public final static String previousVersionOf = "previousVersionOf";
public final DNGraph previousVersionOf(){return arc(previousVersionOf);}
public final static String nextVersionOf = "nextVersionOf";
public final DNGraph nextVersionOf(){return arc(nextVersionOf);}
public final static String hasSection = "hasSection";
public final DNGraph hasSection(){return arc(hasSection);}
public final static String isSectionOf = "isSectionOf";
public final DNGraph isSectionOf(){return arc(isSectionOf);}
public final static String hasPortion = "hasPortion";
public final DNGraph hasPortion(){return arc(hasPortion);}
public final static String hasAttached = "hasAttached";
public final DNGraph hasAttached(){return arc(hasAttached);}
public final static String isPortionOf = "isPortionOf";
public final DNGraph isPortionOf(){return arc(isPortionOf);}
public final static String hasSelection = "hasSelection";
public final DNGraph hasSelection(){return arc(hasSelection);}
public final static String attachedTo = "attachedTo";
public final DNGraph attachedTo(){return arc(attachedTo);}
public final static String hasSnapshot = "hasSnapshot";
public final DNGraph hasSnapshot(){return arc(hasSnapshot);}
public final static String describedBy = "describedBy";
public final DNGraph describedBy(){return arc(describedBy);}
public final static String isSelectionOf = "isSelectionOf";
public final DNGraph isSelectionOf(){return arc(isSelectionOf);}
public final static String describes = "describes";
public final DNGraph describes(){return arc(describes);}
public final static String hasComputation = "hasComputation";
public final DNGraph hasComputation(){return arc(hasComputation);}
public final static String isSnapshotOf = "isSnapshotOf";
public final DNGraph isSnapshotOf(){return arc(isSnapshotOf);}
public final static String isComputationOf = "isComputationOf";
public final DNGraph isComputationOf(){return arc(isComputationOf);}
public final static String hasInference = "hasInference";
public final DNGraph hasInference(){return arc(hasInference);}
public final static String hasDatatypes = "hasDatatypes";
public final DNGraph hasDatatypes(){return arc(hasDatatypes);}
public final static String hasTypes = "hasTypes";
public final DNGraph hasTypes(){return arc(hasTypes);}
public final static String attributesOf = "attributesOf";
public final DNGraph attributesOf(){return arc(attributesOf);}
public final static String relationsOf = "relationsOf";
public final DNGraph relationsOf(){return arc(relationsOf);}
public final static String typesOf = "typesOf";
public final DNGraph typesOf(){return arc(typesOf);}
public final static String disjointCapabilityWith = "disjointCapabilityWith";
public final DNGraph disjointCapabilityWith(){return arc(disjointCapabilityWith);}
public final static String combinedIn = "combinedIn";
public final DNGraph combinedIn(){return arc(combinedIn);}
public final static String hasExtraction = "hasExtraction";
public final DNGraph hasExtraction(){return arc(hasExtraction);}
public final static String hasReification = "hasReification";
public final DNGraph hasReification(){return arc(hasReification);}
public final static String hasAnnotation = "hasAnnotation";
public final DNGraph hasAnnotation(){return arc(hasAnnotation);}
public final static String hasAnonymized = "hasAnonymized";
public final DNGraph hasAnonymized(){return arc(hasAnonymized);}
public final static String datatypesOf = "datatypesOf";
public final DNGraph datatypesOf(){return arc(datatypesOf);}
public final static String optimizedInto = "optimizedInto";
public final DNGraph optimizedInto(){return arc(optimizedInto);}
public final static String hasStatistic = "hasStatistic";
public final DNGraph hasStatistic(){return arc(hasStatistic);}
public final static String refactoredInto = "refactoredInto";
public final DNGraph refactoredInto(){return arc(refactoredInto);}
public final static String cleanedInto = "cleanedInto";
public final DNGraph cleanedInto(){return arc(cleanedInto);}
public final static String hasAttributes = "hasAttributes";
public final DNGraph hasAttributes(){return arc(hasAttributes);}
public final static String hasRelations = "hasRelations";
public final DNGraph hasRelations(){return arc(hasRelations);}
public final static String isAnnotationOf = "isAnnotationOf";
public final DNGraph isAnnotationOf(){return arc(isAnnotationOf);}
public final static String hasSummarization = "hasSummarization";
public final DNGraph hasSummarization(){return arc(hasSummarization);}
public final static String disjointSectionWith = "disjointSectionWith";
public final DNGraph disjointSectionWith(){return arc(disjointSectionWith);}
public final static String usesSchema = "usesSchema";
public final DNGraph usesSchema(){return arc(usesSchema);}
public final static String hasDependency = "hasDependency";
public final DNGraph hasDependency(){return arc(hasDependency);}
public final static String links = "links";
public final DNGraph links(){return arc(links);}
public final static String inconsistentWith = "inconsistentWith";
public final DNGraph inconsistentWith(){return arc(inconsistentWith);}
public final static String refactoredFrom = "refactoredFrom";
public final DNGraph refactoredFrom(){return arc(refactoredFrom);}
public final static String isStatisticOf = "isStatisticOf";
public final DNGraph isStatisticOf(){return arc(isStatisticOf);}
public final static String remodelledFrom = "remodelledFrom";
public final DNGraph remodelledFrom(){return arc(remodelledFrom);}
public final static String redundantWith = "redundantWith";
public final DNGraph redundantWith(){return arc(redundantWith);}
public final static String isDeletionOf = "isDeletionOf";
public final DNGraph isDeletionOf(){return arc(isDeletionOf);}
public final static String isAdditionOf = "isAdditionOf";
public final DNGraph isAdditionOf(){return arc(isAdditionOf);}
public final static String combinationFrom = "combinationFrom";
public final DNGraph combinationFrom(){return arc(combinationFrom);}
public final static String isSummarizationOf = "isSummarizationOf";
public final DNGraph isSummarizationOf(){return arc(isSummarizationOf);}
public final static String isCacheOf = "isCacheOf";
public final DNGraph isCacheOf(){return arc(isCacheOf);}
public final static String isExtractionOf = "isExtractionOf";
public final DNGraph isExtractionOf(){return arc(isExtractionOf);}
public final static String isInferenceOf = "isInferenceOf";
public final DNGraph isInferenceOf(){return arc(isInferenceOf);}
public final static String isUpdatedVersionOf = "isUpdatedVersionOf";
public final DNGraph isUpdatedVersionOf(){return arc(isUpdatedVersionOf);}
public final static String isReificationOf = "isReificationOf";
public final DNGraph isReificationOf(){return arc(isReificationOf);}
public final static String hasCache = "hasCache";
public final DNGraph hasCache(){return arc(hasCache);}
public final static String duplicate = "duplicate";
public final DNGraph duplicate(){return arc(duplicate);}
public final static String isSampleOf = "isSampleOf";
public final DNGraph isSampleOf(){return arc(isSampleOf);}
public final static String identifiersOf = "identifiersOf";
public final DNGraph identifiersOf(){return arc(identifiersOf);}
public final static String optimizedFrom = "optimizedFrom";
public final DNGraph optimizedFrom(){return arc(optimizedFrom);}
public final static String isExampleOf = "isExampleOf";
public final DNGraph isExampleOf(){return arc(isExampleOf);}
public final static String remodelledTo = "remodelledTo";
public final DNGraph remodelledTo(){return arc(remodelledTo);}
public final static String hasSample = "hasSample";
public final DNGraph hasSample(){return arc(hasSample);}
public final static String hasExample = "hasExample";
public final DNGraph hasExample(){return arc(hasExample);}
public final static String disjointPortionWith = "disjointPortionWith";
public final DNGraph disjointPortionWith(){return arc(disjointPortionWith);}
public final static String cleanedFrom = "cleanedFrom";
public final DNGraph cleanedFrom(){return arc(cleanedFrom);}
public final static String hasUpdatedVersion = "hasUpdatedVersion";
public final DNGraph hasUpdatedVersion(){return arc(hasUpdatedVersion);}
public final static String isDependencyOf = "isDependencyOf";
public final DNGraph isDependencyOf(){return arc(isDependencyOf);}
public final static String schemaUsedBy = "schemaUsedBy";
public final DNGraph schemaUsedBy(){return arc(schemaUsedBy);}
public final static String consistentWith = "consistentWith";
public final DNGraph consistentWith(){return arc(consistentWith);}
public final static String linkedBy = "linkedBy";
public final DNGraph linkedBy(){return arc(linkedBy);}
public final static String isAnonymizedOf = "isAnonymizedOf";
public final DNGraph isAnonymizedOf(){return arc(isAnonymizedOf);}
public final static String hasDeletion = "hasDeletion";
public final DNGraph hasDeletion(){return arc(hasDeletion);}
public final static String hasAddition = "hasAddition";
public final DNGraph hasAddition(){return arc(hasAddition);}
public final static String hasIdentifiers = "hasIdentifiers";
public final DNGraph hasIdentifiers(){return arc(hasIdentifiers);}
}