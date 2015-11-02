package rabbitescape.engine.solution;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.*;

public class TestWaitInstruction
{
    @Test
    public void Equal_wait_instructions_are_equal()
    {
        WaitInstruction instr1 = new WaitInstruction( 5 );
        WaitInstruction instr2 = new WaitInstruction( 5 );

        assertThat( instr1, equalTo( instr2 ) );
        assertThat( instr1.hashCode(), equalTo( instr2.hashCode() ) );
    }

    @Test
    public void Different_wait_times_make_them_unequal()
    {
        WaitInstruction instr1 = new WaitInstruction( 5 );
        WaitInstruction instr2 = new WaitInstruction( 4 );

        assertThat( instr1, not( equalTo( instr2 ) ) );

        // Note: technically a correct hashCode could fail this, but it's
        //       desirable that in most cases it won't.
        assertThat(
            instr1.hashCode(), not( equalTo( instr2.hashCode() ) ) );
    }
}
