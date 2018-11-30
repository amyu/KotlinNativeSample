//
//  ViewController.swift
//  base
//
//  Created by Yuki Mima on 2018/11/27.
//  Copyright © 2018年 Yuki Mima. All rights reserved.
//

import UIKit
import di_release
import domain_release
import infra_release

class ViewController: UIViewController {

    @IBOutlet weak var sampleText: UITextField!
    override func viewDidLoad() {
        super.viewDidLoad()
        
    
        
        let apiClient = ApiClient(apiUrl: "https://kotlinist.com/kotlin_ecosystem.html")
        apiClient.fetchSampleApi()
        
        sampleText.text = "Domain_releaseBuildFlavor.dev"
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

