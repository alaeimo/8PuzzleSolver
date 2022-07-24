
package EightPuzzleSolver;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App extends javax.swing.JFrame{
    static private String INIT_STATE = "120345678";
    static private String GOAL_STATE = "123456780";
    private Boolean Started = false;
    private Timer timer;
    private javax.swing.JLabel AlgorithmLabel;
    private javax.swing.JCheckBox EditCheckBox;
    private javax.swing.JButton GenerateBtn;
    private javax.swing.JLabel L0;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton SolveBtn;
    private javax.swing.JComboBox<String> algorithmsBox;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel goalStateLabel;
    private javax.swing.JTextField goalStateTxtBox;
    private javax.swing.JLabel initStateLabel;
    private javax.swing.JTextField initStateTxtBox;
    private javax.swing.JLabel movementCostLabel;
    private javax.swing.JLabel movementCountLabel;
    private javax.swing.JLabel movementLabel;
    private javax.swing.JLabel nodesCountLabel;
    private javax.swing.JLabel nodesLabel;
    private javax.swing.JLabel totalCostCountLabel;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JLabel transitionsLabel;
    private javax.swing.JLabel translationsCountLabel;
    private javax.swing.JLabel visitedStatesCountLabel;
    private javax.swing.JLabel visitedStatesLabel;
    
    public static void main(String[] args) {
        new App().setVisible(true);
    }
   
    public App() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                initComponents();
            }
        });
    }
    
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L0 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        GenerateBtn = new javax.swing.JButton();
        SolveBtn = new javax.swing.JButton();
        EditCheckBox = new javax.swing.JCheckBox();
        AlgorithmLabel = new javax.swing.JLabel();
        algorithmsBox = new javax.swing.JComboBox<>();
        initStateLabel = new javax.swing.JLabel();
        initStateTxtBox = new javax.swing.JTextField();
        goalStateTxtBox = new javax.swing.JTextField();
        goalStateLabel = new javax.swing.JLabel();
        transitionsLabel = new javax.swing.JLabel();
        translationsCountLabel = new javax.swing.JLabel();
        visitedStatesLabel = new javax.swing.JLabel();
        visitedStatesCountLabel = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        totalCostCountLabel = new javax.swing.JLabel();
        nodesLabel = new javax.swing.JLabel();
        nodesCountLabel = new javax.swing.JLabel();
        movementLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        movementCountLabel = new javax.swing.JLabel();
        movementCostLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 255, 204), null));

        L2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setText("2");
        L2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        L1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("1");
        L1.setAlignmentY(0.0F);
        L1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        L4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L4.setText("4");
        L4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        L7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L7.setText("7");
        L7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        L8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L8.setText("8");
        L8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        L0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        L5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L5.setText("5");
        L5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        L3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L3.setText("3");
        L3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        L6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L6.setText("6");
        L6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        L2.getAccessibleContext().setAccessibleName("L2");
        L1.getAccessibleContext().setAccessibleName("L1");
        L1.getAccessibleContext().setAccessibleDescription("");
        L4.getAccessibleContext().setAccessibleName("L4");
        L7.getAccessibleContext().setAccessibleName("L7");
        L8.getAccessibleContext().setAccessibleName("L8");
        L0.getAccessibleContext().setAccessibleName("L9");
        L5.getAccessibleContext().setAccessibleName("L5");
        L3.getAccessibleContext().setAccessibleName("L3");
        L6.getAccessibleContext().setAccessibleName("L6");

        GenerateBtn.setText("Generate");
        GenerateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateBtnActionPerformed(evt);
            }
        });

        SolveBtn.setText("Solve");
        SolveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolveBtnActionPerformed(evt);
            }
        });

        EditCheckBox.setText("Edit");
        EditCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCheckBoxActionPerformed(evt);
            }
        });
        AlgorithmLabel.setText("Algorithm");

        algorithmsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        initStateLabel.setText("Init State");

        goalStateLabel.setText("Goal State");

        transitionsLabel.setText("Transitions");

        translationsCountLabel.setText("-");

        visitedStatesLabel.setText("Visited States");

        visitedStatesCountLabel.setText("-");

        totalCostLabel.setText("Total Cost");

        totalCostCountLabel.setText("-");

        nodesLabel.setText("Nodes");

        nodesCountLabel.setText("-");

        movementLabel.setText("Movement");

        costLabel.setText("Cost");

        movementCountLabel.setText("-");

        movementCostLabel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(movementLabel)
                                    .addComponent(costLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(movementCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(movementCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(SolveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AlgorithmLabel)
                                        .addComponent(EditCheckBox)
                                        .addComponent(initStateLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(goalStateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(goalStateTxtBox)
                                    .addComponent(GenerateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(algorithmsBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(initStateTxtBox))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(visitedStatesLabel)
                                            .addComponent(totalCostLabel)
                                            .addComponent(transitionsLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(translationsCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(totalCostCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(visitedStatesCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nodesLabel)
                                        .addGap(53, 53, 53)
                                        .addComponent(nodesCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlgorithmLabel)
                    .addComponent(algorithmsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transitionsLabel)
                    .addComponent(translationsCountLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditCheckBox)
                    .addComponent(GenerateBtn)
                    .addComponent(visitedStatesLabel)
                    .addComponent(visitedStatesCountLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initStateTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initStateLabel)
                    .addComponent(totalCostLabel)
                    .addComponent(totalCostCountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goalStateTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goalStateLabel)
                    .addComponent(nodesLabel)
                    .addComponent(nodesCountLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SolveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movementLabel)
                            .addComponent(movementCountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costLabel)
                            .addComponent(movementCostLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        initStateLabel.disable();
        goalStateLabel.disable();
        initStateTxtBox.setText(INIT_STATE);
        goalStateTxtBox.setText(GOAL_STATE);
        initStateTxtBox.disable();
        goalStateTxtBox.disable();
        for (Component jl : Panel1.getComponents()) 
        {
            if(jl instanceof JLabel){
                ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

            }    
        }
        int array[] = Random_Generator();
        L1.setText(INIT_STATE.substring(0,1));
        L2.setText(INIT_STATE.substring(1,2));
        L3.setText(INIT_STATE.substring(2,3));
        L4.setText(INIT_STATE.substring(3,4));
        L5.setText(INIT_STATE.substring(4,5));
        L6.setText(INIT_STATE.substring(5,6));
        L7.setText(INIT_STATE.substring(6,7));
        L8.setText(INIT_STATE.substring(7,8));
        L0.setText(INIT_STATE.substring(8,9));
        for (Component jl : Panel1.getComponents()) 
        {
            if(jl instanceof JLabel)
                if(((JLabel)jl).getText().equals("0")){
                    ((JLabel) jl).setText(" ");
                    ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEmptyBorder());   
                }
        }
        movementLabel.disable();
        movementCountLabel.disable();
        costLabel.disable();
        movementCostLabel.disable();
        transitionsLabel.disable();
        translationsCountLabel.disable();
        visitedStatesCountLabel.disable();
        visitedStatesLabel.disable();
        totalCostCountLabel.disable();
        totalCostLabel.disable();
        nodesCountLabel.disable();
        nodesLabel.disable();
        algorithmsBox.removeAllItems();
        algorithmsBox.insertItemAt("Depth First",algorithmsBox.getItemCount());
        algorithmsBox.insertItemAt("Breadth First",algorithmsBox.getItemCount());
        algorithmsBox.insertItemAt("Iterative Deepening",algorithmsBox.getItemCount());
        algorithmsBox.insertItemAt("Uniform Cost",algorithmsBox.getItemCount());
        algorithmsBox.insertItemAt("Best First",algorithmsBox.getItemCount());
        algorithmsBox.insertItemAt("A*",algorithmsBox.getItemCount());
        algorithmsBox.setSelectedIndex(0);

        pack();
    }
    
    
    private void GenerateBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        for (Component jl : Panel1.getComponents()) 
        {
            if(jl instanceof JLabel){
                ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

            }   
        }
        int array[] = Random_Generator();
        String t = "";
        for(int i:array)
            t+=Integer.toString(i);
        initStateTxtBox.setText(t);
        INIT_STATE = t;
        L1.setText(Integer.toString(array[0]));
        L2.setText(Integer.toString(array[1]));
        L3.setText(Integer.toString(array[2]));
        L4.setText(Integer.toString(array[3]));
        L5.setText(Integer.toString(array[4]));
        L6.setText(Integer.toString(array[5]));
        L7.setText(Integer.toString(array[6]));
        L8.setText(Integer.toString(array[7]));
        L0.setText(Integer.toString(array[8]));
        for (Component jl : Panel1.getComponents()) 
        {
            if(jl instanceof JLabel)
                if(((JLabel)jl).getText().equals("0")){
                    ((JLabel) jl).setText(" ");
                    ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEmptyBorder());   
                }  
        }   
    }   
    
    private void EditCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {   
       if(EditCheckBox.isSelected()== true){
            GenerateBtn.setEnabled(false);
            initStateLabel.setEnabled(true);
            goalStateLabel.setEnabled(true);
            initStateTxtBox.setEnabled(true);
            goalStateTxtBox.setEnabled(true);
            INIT_STATE = initStateTxtBox.getText();
            GOAL_STATE = goalStateTxtBox.getText();
       }
       else if(EditCheckBox.isSelected()== false){
            GenerateBtn.setEnabled(true);
            initStateLabel.setEnabled(false);
            goalStateLabel.setEnabled(false);
            initStateTxtBox.setEnabled(false);
            goalStateTxtBox.setEnabled(false);
       }
        for (Component jl : Panel1.getComponents()) 
        {
            if(jl instanceof JLabel){
                ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));

            }    
        }
        L1.setText(INIT_STATE.substring(0,1));
        L2.setText(INIT_STATE.substring(1,2));
        L3.setText(INIT_STATE.substring(2,3));
        L4.setText(INIT_STATE.substring(3,4));
        L5.setText(INIT_STATE.substring(4,5));
        L6.setText(INIT_STATE.substring(5,6));
        L7.setText(INIT_STATE.substring(6,7));
        L8.setText(INIT_STATE.substring(7,8));
        L0.setText(INIT_STATE.substring(8,9));
        for (Component jl : Panel1.getComponents()) 
        {
            if(jl instanceof JLabel)
                if(((JLabel)jl).getText().equals("0")){
                    ((JLabel) jl).setText(" ");
                    ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEmptyBorder());   
                }
        }
    }
    
    private void SolveBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if(Started){
            Started = false;
            timer.stop(); 
            SolveBtn.setText("Solve");
            AlgorithmLabel.setEnabled(true);
            algorithmsBox.setEnabled(true);
            EditCheckBox.setEnabled(true);
            GenerateBtn.setEnabled(true);
            movementLabel.setEnabled(false);
            movementCountLabel.setEnabled(false);
            costLabel.setEnabled(false);
            movementCostLabel.setEnabled(false);
            transitionsLabel.setEnabled(false);
            translationsCountLabel.setEnabled(false);
            visitedStatesCountLabel.setEnabled(false);
            visitedStatesLabel.setEnabled(false);
            totalCostCountLabel.setEnabled(false);
            totalCostLabel.setEnabled(false);
            nodesCountLabel.setEnabled(false);
            nodesLabel.setEnabled(false);
        }
        else{
            Started = true;
            SolveBtn.setText("Stop");
            AlgorithmLabel.setEnabled(false);
            algorithmsBox.setEnabled(false);
            EditCheckBox.setEnabled(false);
            GenerateBtn.setEnabled(false);
            initStateLabel.setEnabled(false);
            goalStateLabel.setEnabled(false);
            initStateTxtBox.setEnabled(false);
            goalStateTxtBox.setEnabled(false);
            movementLabel.setEnabled(true);
            movementCountLabel.setEnabled(true);
            costLabel.setEnabled(true);
            movementCostLabel.setEnabled(true);
            transitionsLabel.setEnabled(true);
            translationsCountLabel.setEnabled(true);
            visitedStatesCountLabel.setEnabled(true);
            visitedStatesLabel.setEnabled(true);
            totalCostCountLabel.setEnabled(true);
            totalCostLabel.setEnabled(true);
            nodesCountLabel.setEnabled(true);
            nodesLabel.setEnabled(true);
            add(new SolvePuzzle());
        }

    }
    public int[] Random_Generator()
    {
        int[] array = {0,1,2,3,4,5,6,7,8};
        Random random = new Random();
        for (int i = array.length; i > 1; i--)
        {
            int j = random.nextInt(i);
            int tmp = array[j];
            array[j] = array[i - 1];
            array[i - 1] = tmp;
        }
        return array;
    }
    
    public class SolvePuzzle extends JPanel {
        
        private int i = 0;
        private Stack<Node> solutionStack;
        private String rootState = INIT_STATE;
        private int totalCost = 0;
        private String sourceState ;
        private String destinationState;
        private int cost = 0;
        
        public SolvePuzzle() {
            
            long startTime = System.currentTimeMillis();
            SearchTree search = new SearchTree(new Node(rootState), GOAL_STATE);
            int Algorithm = algorithmsBox.getSelectedIndex();
            NodeUtil nodeUtil = search.depthFirstSearch() ;
           
            if(Algorithm == 0){
                nodeUtil = search.depthFirstSearch();
                System.out.println("depthFirstSearch()");
            }
            else if(Algorithm==1){
                nodeUtil = search.breadthFirstSearch();
                System.out.println("breadthFirstSearch()"); 
            }
            else if(Algorithm==2){
                nodeUtil = search.iterativeDeepening(20);
                System.out.println("iterativeDeepening(20)"); 
            }
            else if(Algorithm==3){
                nodeUtil = search.uniformCostSearch();
                System.out.println("uniformCostSearch()"); 
            }
            else if(Algorithm==4){
                nodeUtil = search.bestFirstSearch();
                System.out.println("bestFirstSearch()"); 
            }
            else if(Algorithm==5){
                nodeUtil = search.aStar(Heuristic.H_TWO);
                System.out.println("aStar(Heuristic.H_TWO)");   
            }     
            
            Node goalNode = nodeUtil.goalNode;
            Set<String> visitedNodes = nodeUtil.visitedNodes;
            Node root = nodeUtil.root;
            int time = nodeUtil.time;
            solutionStack = new Stack<Node>();
            solutionStack.push(goalNode);
            while (!goalNode.getState().equals(root.getState())) {
                solutionStack.push(goalNode.getParent());
                goalNode = goalNode.getParent();
            }
            sourceState = root.getState();
            i = solutionStack.size() - 1;
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    totalCost = changeJLabel();
                    i--;
                    if (i < 0) {
                        ((Timer)e.getSource()).stop();
                        SolveBtn.setText("Solve");
                        AlgorithmLabel.setEnabled(true);
                        algorithmsBox.setEnabled(true);
                        EditCheckBox.setEnabled(true);
                        GenerateBtn.setEnabled(true);
                        movementLabel.setEnabled(false);
                        movementCountLabel.setEnabled(false);
                        costLabel.setEnabled(false);
                        movementCostLabel.setEnabled(false);
                        transitionsLabel.setEnabled(false);
                        translationsCountLabel.setEnabled(false);
                        visitedStatesCountLabel.setEnabled(false);
                        visitedStatesLabel.setEnabled(false);
                        totalCostCountLabel.setEnabled(false);
                        totalCostLabel.setEnabled(false);
                        nodesCountLabel.setEnabled(false);
                        nodesLabel.setEnabled(false);
                    }
                }
            });
            
            timer.setInitialDelay(0);
            timer.start();
            translationsCountLabel.setText(Integer.toString(solutionStack.size() - 1));
            visitedStatesCountLabel.setText(Integer.toString(visitedNodes.size()));
            nodesCountLabel.setText(Integer.toString(time));
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("** Number of transitions to get to the goal state from the initial state:  " + (solutionStack.size() - 1));
            System.out.println("** Number of visited states:  " + (visitedNodes.size()));
            System.out.println("** Number of Nodes poped out of the queue: " + time);
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            long finishTime = System.currentTimeMillis();
            long totalTime = finishTime - startTime;
            System.out.println("Time  :" + totalTime);

        }

        protected int changeJLabel() {

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            destinationState = solutionStack.get(i).getState();
            if (!sourceState.equals(destinationState)) {
                char l = destinationState.charAt(sourceState.indexOf('0'));
                MovementType direction = findTransition(sourceState, destinationState);
                System.out.println("Move " + l + " " + direction);
                movementCountLabel.setText("Move  " + l + "  " + direction);
                cost = Character.getNumericValue(destinationState.charAt(sourceState.indexOf('0')));
                totalCost += cost;
            }

            sourceState = destinationState;
            System.out.println("Cost of the movement: " + cost);
            movementCostLabel.setText(Integer.toString(cost));
            System.out.println("*******");
            System.out.println("* " + solutionStack.get(i).getState().substring(0, 3)+" *");
            System.out.println("* " + solutionStack.get(i).getState().substring(3, 6)+" *");
            System.out.println("* " + solutionStack.get(i).getState().substring(6, 9)+" *");
            System.out.println("*******");
            
            for (Component jl : Panel1.getComponents()) 
            {   
                if(jl instanceof JLabel){
                    ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 51), null));
                    
                }
            }
            L1.setText(solutionStack.get(i).getState().substring(0,1));
            L2.setText(solutionStack.get(i).getState().substring(1,2));
            L3.setText(solutionStack.get(i).getState().substring(2,3));
            L4.setText(solutionStack.get(i).getState().substring(3,4));
            L5.setText(solutionStack.get(i).getState().substring(4,5));
            L6.setText(solutionStack.get(i).getState().substring(5,6));
            L7.setText(solutionStack.get(i).getState().substring(6,7));
            L8.setText(solutionStack.get(i).getState().substring(7,8));
            L0.setText(solutionStack.get(i).getState().substring(8,9));
           for (Component jl : Panel1.getComponents()) 
            {
                if(jl instanceof JLabel)
                if(((JLabel)jl).getText().equals("0")){
                    ((JLabel) jl).setText(" ");
                    ((JLabel) jl).setBorder(javax.swing.BorderFactory.createEmptyBorder());   
                }
            } 
           totalCostCountLabel.setText(Integer.toString(totalCost));
           return  totalCost;
        }
        public MovementType findTransition(String source, String destination) {
            int zero_position_difference = destination.indexOf('0') - source.indexOf('0');
            switch (zero_position_difference) {
                case -3:
                    return MovementType.DOWN;
                case 3:
                    return MovementType.UP;
                case 1:
                    return MovementType.LEFT;
                case -1:
                    return MovementType.RIGHT;
            }
            return null;
        }
        public void setLocation(JLabel label,MovementType direction){
            if(null != direction)
                switch (direction) {
                case UP:
                    label.setLocation(label.getLocation().x,label.getLocation().y-106);
                    break;
                case DOWN:
                    label.setLocation(label.getLocation().x,label.getLocation().y+106);
                    break;
                case LEFT:
                    label.setLocation(label.getLocation().x-105,label.getLocation().y);
                    break;
                case RIGHT:
                    label.setLocation(label.getLocation().x+105,label.getLocation().y);
                    break;
                default:
                    break;
        }
    }

    }

}
