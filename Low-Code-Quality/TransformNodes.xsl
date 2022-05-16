<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

 <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" />
        </xsl:copy>
 </xsl:template>
 
<xsl:template match="NodeSystem/Nodes/Node">
	<xsl:if test="@NodeClassId = '3z8DY1_dU0aTkeHdrkCD0g'">
		<AugmentNode><xsl:apply-templates select="@*|node()"/></AugmentNode>
	</xsl:if>
	<xsl:if test="@NodeClassId = '0uv5T0BOXUW3uYJdDbGmfQ'">
		<DuplicatRowsNode><xsl:apply-templates select="@*|node()"/></DuplicatRowsNode>
	</xsl:if>
	<xsl:if test="@NodeClassId = 'FUJhUKKzxU6F6Ay7MBc80w'">
                <scanNode><xsl:apply-templates select="@*|node()"/></scanNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'HyydmMdCAE6xoRdlTdAqoA'">
                <conditionalStyleNode><xsl:apply-templates select="@*|node()"/></conditionalStyleNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'PXeUHj_LXESV3Hi1oXhjZQ'">
                <clearDecorationsNode><xsl:apply-templates select="@*|node()"/></clearDecorationsNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '_p-y0QrPAkei1AHtLRVcTA'">
                <errorFilterNode><xsl:apply-templates select="@*|node()"/></errorFilterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '_orhVvEe80ONt5Qf40by7Q'">
                <errorHandlingNode><xsl:apply-templates select="@*|node()"/></errorHandlingNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'X0cJsvaPf06jYZSfuFqR6Q'">
                <errorMessagesNode><xsl:apply-templates select="@*|node()"/></errorMessagesNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '29FkY9f_BEqD679wyvbY2Q'">
                <indexNode><xsl:apply-templates select="@*|node()"/></indexNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'KPRnfT1hw0OcUISNv588AQ'">
                <namingNode><xsl:apply-templates select="@*|node()"/></namingNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'ZtokXeIrIk22iXDwDEcaWw'">
                <cacheNode><xsl:apply-templates select="@*|node()"/></cacheNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'qTfji8ICa0qv5X-zfkTXpg'">
                <decomposeColumnNode><xsl:apply-templates select="@*|node()"/></decomposeColumnNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'hNCmphGOCUSvH_tnTCza1A'">
                <decomposeColumnsNode><xsl:apply-templates select="@*|node()"/></decomposeColumnsNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '9w2Yc84hx0GfG8txefDMig'">
                <ReplaceColumnNode><xsl:apply-templates select="@*|node()"/></ReplaceColumnNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'CxUldxIziUGZcpROcelMrA'">
                <columnNameReductionNode><xsl:apply-templates select="@*|node()"/></columnNameReductionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '1pQwQKs6lkOspGPAYIxfxw'">
                <columnPrefixNode><xsl:apply-templates select="@*|node()"/></columnPrefixNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '8ytXpTVs-kS0Cd3kJhB-aw'">
                <changeColumnPrefixNode><xsl:apply-templates select="@*|node()"/></changeColumnPrefixNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'U98HgCln00aTWqlK_VhCYw'">
                <changeColumnSuffixNode><xsl:apply-templates select="@*|node()"/></changeColumnSuffixNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'wNGHn-V1w0WMcCcgbhUr1A'">
                <ColumnRenameNode><xsl:apply-templates select="@*|node()"/></ColumnRenameNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'sWbYr11Bf0mxGPrlv7w0Cw'">
                <retargetReferenceNode><xsl:apply-templates select="@*|node()"/></retargetReferenceNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'vkzTVQzR-k-4doas42tsVA'">
                <retargetAllReferencesNode><xsl:apply-templates select="@*|node()"/></retargetAllReferencesNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'iRzVMkwStU6dBLcHpkP0jg'">
                <predecessorValueNode><xsl:apply-templates select="@*|node()"/></predecessorValueNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'qS1h16vgikCqi5UghMEiAA'">
                <conditionalNullificationNode><xsl:apply-templates select="@*|node()"/></conditionalNullificationNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'vMSgVJlxbkmVVfpx7LoT8A'">
                <NamedClassificationNode><xsl:apply-templates select="@*|node()"/></NamedClassificationNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'jzZGKqUmBEGfJjgLPewdTg'">
                <singleValueNode><xsl:apply-templates select="@*|node()"/></singleValueNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'BljaLxieHUWv8koO7QSzGw'">
                <geocoordinateFromLatlongNode><xsl:apply-templates select="@*|node()"/></geocoordinateFromLatlongNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'ZWU3tVTxeE6k0hgFpdy72A'">
                <classifyNode><xsl:apply-templates select="@*|node()"/></classifyNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '8hMzJqnhbkW4evG_aN8yag'">
                <listToColumnNode><xsl:apply-templates select="@*|node()"/></listToColumnNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'UnpxsKWHiEKLCExw1TqRkw'">
                <parseNode><xsl:apply-templates select="@*|node()"/></parseNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'iX-_8BNPe0uRSqTutQQklQ'">
                <defaultValueNode><xsl:apply-templates select="@*|node()"/></defaultValueNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'dKlr8AWUGUGP7gqdKM8-9g'">
                <substringNode><xsl:apply-templates select="@*|node()"/></substringNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'vPrqtKjEBUuS8mJRA2STyQ'">
                <stringSplitterNode><xsl:apply-templates select="@*|node()"/></stringSplitterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'qOXXFhm4bEubpW53o5Hm_Q'">
                <convertNode><xsl:apply-templates select="@*|node()"/></convertNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'MEm1KSvMb0SBCvPnX1S24A'">
                <replaceValuesNode><xsl:apply-templates select="@*|node()"/></replaceValuesNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'ptY41ieC0keY3SWZRi7GYQ'">
                <stringUtilNode><xsl:apply-templates select="@*|node()"/></stringUtilNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'mjdsKfERUE6FU-7yGeRWyg'">
                <roundDateNode><xsl:apply-templates select="@*|node()"/></roundDateNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'K9sdqDTJW027gEoLW5A8hA'">
                <TimeSpanConversionNode><xsl:apply-templates select="@*|node()"/></TimeSpanConversionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '5mBZsHIg30-Z0b_X-zRe-w'">
                <convertDateNode><xsl:apply-templates select="@*|node()"/></convertDateNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'MIBo4j_-vUCEKBDype0yGQ'">
                <dateOffsetNode><xsl:apply-templates select="@*|node()"/></dateOffsetNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'zzbBj-mL1EGhm0xQy-YQ1A'">
                <conditionNode><xsl:apply-templates select="@*|node()"/></conditionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '5ispippprE69uLROfTm6og'">
                <existenceNode><xsl:apply-templates select="@*|node()"/></existenceNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '8Nk6Yg_G5EeR25FIhyWCNw'">
                <EqualityNode><xsl:apply-templates select="@*|node()"/></EqualityNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '_gKX18gn70KjpgdUed9aTw'">
                <lookupNode><xsl:apply-templates select="@*|node()"/></lookupNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '3VPuxEhCXkKl7wkx71wPWg'">
                <findColumnNode><xsl:apply-templates select="@*|node()"/></findColumnNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'KKNu49bY4USzt57NhHxdvA'">
                <comparisonNode><xsl:apply-templates select="@*|node()"/></comparisonNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'Vri-HfxXrEGoEESsrtUh-g'">
                <unionAllNode><xsl:apply-templates select="@*|node()"/></unionAllNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '3z8DY1_dU0aTkeHdrkCD0g'">
                <augmentNode><xsl:apply-templates select="@*|node()"/></augmentNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'TuhXnlaJ90KXsfY8CJkQLg'">
                <takeWhileNode><xsl:apply-templates select="@*|node()"/></takeWhileNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'L5lbbAJU20-VuiHBJmhmYw'">
                <boolFilterNode><xsl:apply-templates select="@*|node()"/></boolFilterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'mktRh0ScAk-nwC_awR8xVw'">
                <demultiplexerNode><xsl:apply-templates select="@*|node()"/></demultiplexerNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '22sWpLIJ0ESIqtdHwc8rgQ'">
                <domainMappingNode><xsl:apply-templates select="@*|node()"/></domainMappingNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'H7xcnMaWD0OyTc6IdlcA7A'">
                <singleRowNode><xsl:apply-templates select="@*|node()"/></singleRowNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'z9-iLbQrZ0GVjor47qG3PQ'">
                <UnpivotNode><xsl:apply-templates select="@*|node()"/></UnpivotNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '3FGyDa73NEebvAWlpBLAwA'">
                <existenceFilterNode><xsl:apply-templates select="@*|node()"/></existenceFilterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'zAp6lWOy00GMge_dmBFKfQ'">
                <filterNode><xsl:apply-templates select="@*|node()"/></filterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'pAFzDGoRG06LustM4ZXCAw'">
                <groupNode><xsl:apply-templates select="@*|node()"/></groupNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'p5vpJA8sq0WmE4FWVLBreQ'">
                <groupIntoNode><xsl:apply-templates select="@*|node()"/></groupIntoNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'uTEMvJZSRUGwV4rtUkHZnA'">
                <ComplementNode><xsl:apply-templates select="@*|node()"/></ComplementNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'XPadEFyD9ki6369dj9gfDw'">
                <expandValuesNode><xsl:apply-templates select="@*|node()"/></expandValuesNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'P0agyQx2Ek2rXnTwvG85Sg'">
                <neighborNode><xsl:apply-templates select="@*|node()"/></neighborNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'EQuUDcmWM0SOBJ4HSxmfiw'">
                <pivotNode><xsl:apply-templates select="@*|node()"/></pivotNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'PCFQ_v5mNUGmM4N8lhyu9A'">
                <sortNode><xsl:apply-templates select="@*|node()"/></sortNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'd_LuyPehy06-QFCVkrlF7g'">
                <batchColumnConversionNode><xsl:apply-templates select="@*|node()"/></batchColumnConversionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'et5AWgfBPk-z520YEvhFww'">
                <structureCastNode><xsl:apply-templates select="@*|node()"/></structureCastNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 's4mwvrGDo0ugUt5uSDpZ1Q'">
                <expandNestedTablesNode><xsl:apply-templates select="@*|node()"/></expandNestedTablesNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'APAoXzy7xE-u0zErzkbVmw'">
                <outerJoinNode><xsl:apply-templates select="@*|node()"/></outerJoinNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'C7Yp5YvLGUWFk257N-YRZQ'">
                <innerJoinNode><xsl:apply-templates select="@*|node()"/></innerJoinNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'sHG29pn9V0SoZLl9IzWXZg'">
                <innerEquiJoinNode><xsl:apply-templates select="@*|node()"/></innerEquiJoinNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'MxoRiXgAikOHFA32Zlxu-A'">
                <nestedJoinNode><xsl:apply-templates select="@*|node()"/></nestedJoinNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'rao-4h8Em0ikrnxfPLOyXw'">
                <crossJoinNode><xsl:apply-templates select="@*|node()"/></crossJoinNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '0LMX5t304k2YBPHJ2518bQ'">
                <referenceNode><xsl:apply-templates select="@*|node()"/></referenceNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '4dhfE4LnKk6530nvQ8gMQA'">
                <fullOuterJoinNode><xsl:apply-templates select="@*|node()"/></fullOuterJoinNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'zUKFgl5hFUKsf2kp5Bwa6w'">
                <multiplyRowsNode><xsl:apply-templates select="@*|node()"/></multiplyRowsNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'nuhIAu6i90i5yTJ6w-k75Q'">
                <mergeNode><xsl:apply-templates select="@*|node()"/></mergeNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '8GOx-NN8DkCzHhkEcrPaYA'">
                <successorAsNeighborNode><xsl:apply-templates select="@*|node()"/></successorAsNeighborNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'wdBjC0qsYU2ZNh5qvld4PA'">
                <overlayNode><xsl:apply-templates select="@*|node()"/></overlayNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'uD-SF2MlxUCWl5waRepJfg'">
                <SummaryNode><xsl:apply-templates select="@*|node()"/></SummaryNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 't16jfnmt1U2ASWA9hmMvVQ'">
                <arithmeticNode><xsl:apply-templates select="@*|node()"/></arithmeticNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'zZO3se-0WEuUHviaGxzCdg'">
                <imageNode><xsl:apply-templates select="@*|node()"/></imageNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'QrdOqQQuC0uE3rC1bYTlXQ'">
                <expressionNode><xsl:apply-templates select="@*|node()"/></expressionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'eTHmcg2rjEWzuJfmuvsWVg'">
                <CostFunctionNode><xsl:apply-templates select="@*|node()"/></CostFunctionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'Yr0eDchm6kmcA30HyB_rWw'">
                <logicNode><xsl:apply-templates select="@*|node()"/></logicNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'uPQEqucYcUqx97eXsIxCyw'">
                <negateNode><xsl:apply-templates select="@*|node()"/></negateNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '2UAPeVVAWkKMeriscqNWJA'">
                <orNode><xsl:apply-templates select="@*|node()"/></orNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'osh4BzuGvUW8qxrbPCaJlQ'">
                <productNode><xsl:apply-templates select="@*|node()"/></productNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'iB9bwAKaakWMRPwyafyQnw'">
                <roundNode><xsl:apply-templates select="@*|node()"/></roundNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '2ELNdwyckkGpKP47d1cR5Q'">
                <sumNode><xsl:apply-templates select="@*|node()"/></sumNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '07sPELX4QkW0yg8hlOSMWw'">
                <binPackingNode><xsl:apply-templates select="@*|node()"/></binPackingNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'eujFdztSbky1bABPoO_hkw'">
                <hierarchicalClusteringNode><xsl:apply-templates select="@*|node()"/></hierarchicalClusteringNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'LJBBGSPSyEW0KkNfSx1J1w'">
                <packagingNode><xsl:apply-templates select="@*|node()"/></packagingNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '8jUsCwrOaES3iKo8Qq5DrQ'">
                <geocoderNode><xsl:apply-templates select="@*|node()"/></geocoderNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'HOKuhqT2Z0etlmyFDE76ow'">
                <georouterNode><xsl:apply-templates select="@*|node()"/></georouterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'CnkDDNRoVkaDswtmBPtlLQ'">
                <graphClusterNode><xsl:apply-templates select="@*|node()"/></graphClusterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'vusNCI6xYU2DTw86ePJ1Qw'">
                <LimitFilterNode><xsl:apply-templates select="@*|node()"/></LimitFilterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'aGrYRlJ6bESYbOrr27WFMA'">
                <reverseGeocoderNode><xsl:apply-templates select="@*|node()"/></reverseGeocoderNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'uqCwcmiA5UW2DbXQvOD55g'">
                <consolidationNode><xsl:apply-templates select="@*|node()"/></consolidationNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '1nDTvjV0EEaQKRfvU_vGyg'">
                <shortest-pathNode><xsl:apply-templates select="@*|node()"/></shortest-pathNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'zreEWzHOekGRaAQH6vI7tQ'">
                <redistributionNode><xsl:apply-templates select="@*|node()"/></redistributionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'sRPgQtSvUO7n95-DjXJgw'">
                <centerOfGravityNode><xsl:apply-templates select="@*|node()"/></centerOfGravityNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'kFzxej80e0CFOp52De-mtw'">
                <parseConditionNode><xsl:apply-templates select="@*|node()"/></parseConditionNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '9zkS0UP02EiJQ6TjNrDjjQ'">
                <finitesequenceNode><xsl:apply-templates select="@*|node()"/></finitesequenceNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'jpdsBxqAXU6MqzX1wL3_hQ'">
                <groupIndexNode><xsl:apply-templates select="@*|node()"/></groupIndexNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'kEnAAsrqI0WdEadNT5MNAA'">
                <groupRowIndexNode><xsl:apply-templates select="@*|node()"/></groupRowIndexNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'PGddLuF_V0SXQYZLwpZthQ'">
                <constantNode><xsl:apply-templates select="@*|node()"/></constantNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'gNE-St3CdEqlcLXLb1OvDA'">
                <arrayNode><xsl:apply-templates select="@*|node()"/></arrayNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 't64UL7OQQUyzvdEScazPhQ'">
                <nullNode><xsl:apply-templates select="@*|node()"/></nullNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'XPLY81hjtkiOEnzgtyMK5Q'">
                <parameterNode><xsl:apply-templates select="@*|node()"/></parameterNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'WMVhxEDgn0Swg3-0zmckXA'">
                <noiseNode><xsl:apply-templates select="@*|node()"/></noiseNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'NHKLUoutLEqI01Z5S-h0Ew'">
                <sequenceNode><xsl:apply-templates select="@*|node()"/></sequenceNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'e_jItwDpwki932PMALyBPg'">
                <rowIndexNode><xsl:apply-templates select="@*|node()"/></rowIndexNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'uTU4B5Cv4kKo6DkNIodfRg'">
                <timeNode><xsl:apply-templates select="@*|node()"/></timeNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'HRxvWg3rzkWKlqJ7Bf64DA'">
                <debugNode><xsl:apply-templates select="@*|node()"/></debugNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '0uv5T0BOXUW3uYJdDbGmfQ'">
                <duplicateRowsNode><xsl:apply-templates select="@*|node()"/></duplicateRowsNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'QLm-3FcFSU-ibZpgkDZhBA'">
                <profileNode><xsl:apply-templates select="@*|node()"/></profileNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'olnl4KcKTUams_DWgAQH1w'">
                <columnAnalysisNode><xsl:apply-templates select="@*|node()"/></columnAnalysisNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'reGCLYXokE2Ld9mGiAznvw'">
                <columnProfileNode><xsl:apply-templates select="@*|node()"/></columnProfileNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'nQHn_rp_sk-dPQmY24ZYCg'">
                <formatNode><xsl:apply-templates select="@*|node()"/></formatNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'HDTwUgp_mUuTGAbFyz3dpQ'">
                <multiplexNode><xsl:apply-templates select="@*|node()"/></multiplexNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'Xtj01G-Ti0OEltcPrMfdyg'">
                <checksumNode><xsl:apply-templates select="@*|node()"/></checksumNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'M0YLbEvHO0uazFE3jI47VA'">
                <surrogateNode><xsl:apply-templates select="@*|node()"/></surrogateNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'hf_cYBY1IEGWcf9YOL2aNQ'">
                <tupleNode><xsl:apply-templates select="@*|node()"/></tupleNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'LRxv-JvGL0G6FsgtmSjZ9A'">
                <countOccurrencesNode><xsl:apply-templates select="@*|node()"/></countOccurrencesNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '4poQfe2470moTEmhU0VqEw'">
                <TimeSpanNode><xsl:apply-templates select="@*|node()"/></TimeSpanNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '4LRxwlzbG0WwxoKhl3OJyg'">
                <aggregationNode><xsl:apply-templates select="@*|node()"/></aggregationNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'HX5FNMyZIE-hQ-rPbVhdeQ'">
                <analysisNode><xsl:apply-templates select="@*|node()"/></analysisNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'ST6I1YWdYUGJgCbdffDigA'">
                <argQuantileNode><xsl:apply-templates select="@*|node()"/></argQuantileNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'D-3wh05BSEaNveBvZsiBvg'">
                <distinctValuesNode><xsl:apply-templates select="@*|node()"/></distinctValuesNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'PVTOVUhxYEWWtVDhyu58Mg'">
                <DistinctRowsNode><xsl:apply-templates select="@*|node()"/></DistinctRowsNode>
                </xsl:if>
<xsl:if test="@NodeClassId = '43eXyXgshEuXyKzxIZgpjQ'">
                <combinationsNode><xsl:apply-templates select="@*|node()"/></combinationsNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'ZgFKYBH-1U2gZ8hqIAGNRg'">
                <topOfGroupsNode><xsl:apply-templates select="@*|node()"/></topOfGoupsNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'dSj3vxkltUag5KOGvvgW9A'">
                <runningTotalNode><xsl:apply-templates select="@*|node()"/></runningTotalNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'baRjr1raUESMc6X-_5esvw'">
                <TopNode><xsl:apply-templates select="@*|node()"/></TopNode>
                </xsl:if>
<xsl:if test="@NodeClassId = 'ccQoTd4aFU-aggdunXNApQ'">
                <paretoFrontiersNode><xsl:apply-templates select="@*|node()"/></paretoFrontiersNode>
                </xsl:if>

</xsl:template>
</xsl:stylesheet>