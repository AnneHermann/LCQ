/**
 */
package AlleKnotenFormartiert.tests;

import AlleKnotenFormartiert.AlleKnotenFormartiertFactory;
import AlleKnotenFormartiert.NodeType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeTypeTest extends ANodeTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeTypeTest.class);
	}

	/**
	 * Constructs a new Node Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeType getFixture() {
		return (NodeType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AlleKnotenFormartiertFactory.eINSTANCE.createNodeType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NodeTypeTest
